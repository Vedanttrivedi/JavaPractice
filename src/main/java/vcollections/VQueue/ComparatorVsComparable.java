package vcollections.VQueue;

import vcollections.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Use Comparable when you want to define a single natural ordering for objects of a class. compareTo(Obj o1)
Use Comparator when you need multiple ways to order objects or when you can't modify the class to implement Comparable. compare(Obj o1,Obj o2)
*/

class NameComprator implements Comparator<Log>
{
    @Override
    public int compare(Log l1,Log l2)
    {
        return l1.getName().compareTo(l2.getName());
    }
}

public class ComparatorVsComparable
{
    public static void main(String[] args)
    {
        List<Log> logs =
                new ArrayList<>();
        logs.add(new Log("Auth log","11-April-2034","Vedant"));
        logs.add(new Log("PrintAuth log","24-April-2034","Birat"));

        logs.add(new Log("Print log","10-April-2034","Virat"));


        //Now sort all the logs based on the date
        //Using Comparable
        Collections.sort(logs);


//        //Using Comparator multiple times
//        Collections.sort(logs, new Comparator<Log>() {
//            @Override
//            public int compare(Log l1,Log l2) {
//                return l1.getTimestamp().compareTo(l2.getTimestamp());
//            }
//        });
//        //Collections.sort(logs,new NameComprator());
//        System.out.println(logs);
//

        //with java 8 enhancement


    }
}


