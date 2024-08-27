package Threader.samplePrograms;

public class Addition
{
    static  int total = 0;
    public static void sum()
    {
        for(int i=1;i<=100000;i++)
            total+=i;
    }
    public static void main(String[] args) throws InterruptedException
    {

        //Addition.sum();
        System.out.println(total);
        Runnable runner1 = () ->{
          for(int j=1;j<=50;j++)
              total+=j;
        };
        Runnable runner2 = () ->{
          for(int j=51;j<=100;j++)
              total+=j;
        };

        Thread t1 = new Thread(runner1);
        Thread t2 = new Thread(runner2);
        t1.start();
        t2.start();
        t1.join();

        System.out.println(total);
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Completed");
    }
}