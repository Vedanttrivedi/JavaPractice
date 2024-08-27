package Threader;

public class Vjoin
{
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
           for(var i=1;i<=100;i++)
               System.out.println("From T1 "+i);
        });

        Thread t2 = new Thread(()->{
           for(var j=1;j<=100;j++)
               System.out.println("From T2 "+j);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Main Thread Fininshed");
    }
}
