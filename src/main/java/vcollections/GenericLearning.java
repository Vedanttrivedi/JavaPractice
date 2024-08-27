package vcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GenericLearning {
    public static void main(String[] args) {
        //No type safety is mentioned as box can have string,int any type of value
        //so chances of errors increses runtime

        Box b1 = new Box(12);
        System.out.println(b1.get());
        Box b2 = new Box("string");
        b2.get();

        //With Generics We can typesafe  our code
        //So We will have less runtime errors and compile time itself we will know that what values
        //are allowed in this object

        UpDatedBox<String> ubox = new UpDatedBox<String>("Noice");
        UpDatedBox<Integer> ubox2 = new UpDatedBox<>(12);
        UpDatedBox box3 = new UpDatedBox(1);
        try{
            box3.forStrings();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

//Without Generic
class Box {
    Object value;
    Box(Object value)
    {
        this.value = value;
    }

    Object get()
    {
        return this.value;
    }
}

class UpDatedBox <T>
{
    T value;

    UpDatedBox(T value)
    {
        this.value = value;
    }

    public void forStrings() throws Exception
    {

        if(this.value instanceof String)
        {
            System.out.println(((String)this.value).length());
            return;
        }
        else if(this.value instanceof Object)
        {
            System.out.println("Object type!");
            return;
        }
        throw new Exception("not applicable");
    }
}