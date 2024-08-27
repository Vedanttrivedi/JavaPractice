package Threader;

import java.sql.SQLOutput;

public class ThreadPriority {

    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());

        Thread t2 = new Thread(()->{
            for(int i=1;i<=100;i++)
                System.out.println("From t2 "+i);
        });
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        System.out.println("main finished");
    }
}
