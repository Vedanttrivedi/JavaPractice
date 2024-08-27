package vcollections;

import java.util.function.Predicate;

//Predicate is boolean valued function
//It returns boolean value based on condition
//Mostly used in boolean function
public class Predictater
{
    public static void main(String[] args)
    {
        Predicate<Integer> vals = val -> val%2==0;//it is functional interface
        //which one abstract method test which we have to override
        Predicate<String> letterStartsWithV = str -> str.toLowerCase().charAt(0) == 'v';

        if(vals.test(20))
            System.out.println("Even Val");

        if(letterStartsWithV.test("Vedant"))
            System.out.println("Noice name");

        //When we want to check multiple predicates
        Predicate<String>letterEndsWithT = str -> str.toLowerCase().charAt(str.length()-1) == 't';
        System.out.println(letterStartsWithV.and(letterEndsWithT).test("Vedant"));//and
        System.out.println(letterStartsWithV.or(letterEndsWithT).test("Vedang"));//or


        //when we want to oppose the predicate we do negate
        System.out.println(letterStartsWithV.negate().test("Vedant"));
    }
}
