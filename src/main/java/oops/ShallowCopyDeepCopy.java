package oops;

import java.util.concurrent.atomic.AtomicLongArray;

public class ShallowCopyDeepCopy
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        City c1 = new City();
        c1.name = "AHME";
        City c2 = c1;//here references are copied so any changes made in c2 will refelect in c1
        c1.data[1] = 3;
        //Shallow Copy
        City c3=(City) c1.clone();
        c3.name="Mum";
        c3.data[1] =4;
        System.out.println(c1.hashCode() +"\t"+ c3.hashCode());
        System.out.println(c1.name +"\t"+c3.name);
        System.out.println(c3.name.hashCode() +"\t"+c1.name.hashCode());
    }
}
/*
* When you perform a shallow copy using the clone() method (assuming the clone() method in City
*  is implemented correctly for a shallow copy), the references for reference types (like arrays or other objects)
*  are copied, meaning both the original and the copied object refer to the same array or object.
However, when you change the name field of c3, you're not modifying the original String that
* c1.name refers to. Instead, you're making c3.name point to a new String object,
* while c1.name still points to the original String object.
*
* */
class City implements Cloneable
{
    String name;
    String population;
    String country;
    int[] data = new int[]{2,3};

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return  super.clone();
    }
}

class Street{
    String streetname;
}