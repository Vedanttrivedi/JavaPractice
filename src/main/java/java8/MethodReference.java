package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//MethodReference is used to pass method as parameter or value
public class MethodReference
{
    private static void isPrime(int num)
    {
        if(num <=2)
        {
            System.out.println("prime");
            return;
        }
        boolean isPrime = true;
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                System.out.println("not prime");
                isPrime = !isPrime;
                break;
            }
        }
        if(isPrime)
            System.out.println("Prime");
    }
    public void print(int num){
        System.out.print(num);
    }
    public static void main(String[] args)
    {

        List<Integer> ls = Arrays.asList(10,20,30,13,3);
        //ls.forEach(value -> isPrime(value));//one way to call
        ls.forEach(MethodReference::isPrime);//another way to use, it is used to refer a method static
        //if we wanted to refer a instance method
        MethodReference mfr = new MethodReference();
        ls.forEach(mfr::print);

    }
}
