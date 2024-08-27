package Threader;

public class VRunnable implements Runnable
{
    public void run()
    {
        for (int i=1;i<=100;i++)
        {
            System.out.printf("Threader %d\n",i);
        }
    }
    public static void main(String[] args)
    {
        VRunnable v1 = new VRunnable();
        SecondRunnable sr1 = new SecondRunnable();
        Thread th = new Thread(v1);
        Thread th2 = new Thread(sr1);
        th.start();
        th2.start();
    }
}
class SecondRunnable implements Runnable
{
    public void run()
    {
        for(int j=1;j<=100;j++)
            System.out.printf("Thread B %d",j);
    }
}