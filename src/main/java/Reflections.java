import java.lang.reflect.Method;
import java.util.Observable;

public class Reflections
{
    public static void main(String[] args) throws Exception
    {
        Sample s1 = new Sample();
        Method[] methods = s1.getClass().getDeclaredMethods();
        for(Method method:methods){
            if(method.getName().equals("seter")){
                method.setAccessible(true);
                method.invoke(s1);
            }
        }
    }
}


class Sample{
    private int age;
    public int getAge(){
        return  this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    private int seter(){
        System.out.println("Hello from seter private");
        return 1;
    }
}
