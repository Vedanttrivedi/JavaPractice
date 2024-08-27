package Threader;

class A extends Thread
{
    public void run()
    {
        for (int i=1;i<=100;i++)
        {
            System.out.println("In A"+Thread.currentThread());
            System.out.printf("A Class %d\n",i);
        }
    }
}
class B extends Thread
{

    public void run()
    {
        for (int i=1;i<=100;i++)
        {
            System.out.println("In B"+Thread.currentThread());
            System.out.printf("B Class %d\n",i);
        }
    }
}

public class VThreader
{
    public static void main(String[] args)
    {
        A a = new A();
        a.start();
        System.out.println(Thread.currentThread());
        B b = new B();
        b.start();
    }
}
