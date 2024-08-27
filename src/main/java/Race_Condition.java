import java.util.TreeMap;

class Counter
{
    int counter;
    public synchronized void increment()
    {
        //synchronized is used to prevent shared resource to be executed by more threads
        //it make sure that only one resource is able to access the resource

        counter++;
    }
}

public class Race_Condition
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter c1 = new Counter();
        Runnable r1 = () ->
        {
            for(int val=1;val<=1000;val++)
            {
                c1.increment();
            }
        };
        Runnable r2 = () ->
        {
            for(int val=1;val<=2000;val++)
            {
                c1.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();


        t1.join();
        t2.join();

        //join method is used to wait for threads to complete executing
        //here we are saying once the both thread complete executing then only execute print statement

        System.out.println(c1.counter);
    }
}