package Threaders;

import java.util.LinkedList;
import java.util.Queue;

class Producer extends Thread
{
    Queue<Integer> q;
    int maxSize,count;
    Producer(Queue q,int size)
    {
        this.q = q;
        maxSize = size;
    }
    public void run()  {
        synchronized(q){
           try
           {
            while(true)
            {
                if(q.size()==maxSize)
                {
                    System.out.println("Queue is full!");
                    q.wait();
                }
                count++;
                q.offer(count);
                q.notify();
            }
           }
           catch(Exception e)
           {
                System.out.println(e.getMessage());
           }
        }
    }
}

class Consumer extends Thread
{
    Queue<Integer>q;
    int maxSize,count;
    Consumer(Queue q,int size)
    {
        this.q=q;
        this.maxSize = size;
    }
    public void run(){
        synchronized(q){
            try
            {
                while (true)
                {
                    if(q.isEmpty())
                    {
                        System.out.println("Consumer Waiting...");
                        q.wait();
                    }
                    while(!q.isEmpty())
                    {
                        System.out.println("Last element from "+q.poll());
                        q.notify();
                    }
                    
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
class Logs extends Thread
{
    String message;
    int a=12;
    final String file="logs.txt";
    public void run(){
        System.out.println("ShutDown Hook");
    }
}
class LogA extends Logs
{
    int a=13;
}
public class Main
{
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        Producer p1 = new Producer(q, 10);
        Consumer c1 = new Consumer(q, 10);
       // p1.start();
        //c1.start();
        Logs l1 = new LogA();
        System.out.println(l1.a);
        //Runtime.getRuntime().addShutdownHook(new Logs());
    }    
}
