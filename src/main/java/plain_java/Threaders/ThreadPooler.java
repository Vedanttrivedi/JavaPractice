package Threaders;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPooler 
{
    public static void main(String[] args)
    {
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(5);
        
        ThreadFactory factory  = new ThreadFactory()
        {
          public Thread newThread(Runnable r)
          {
            return new Thread(r);
          }  
        };
        
        // RejectedExecutionHandler reh = new RejectedExecutionHandler() {
            
        // };

        ThreadPoolExecutor pool = new ThreadPoolExecutor(4, 10, 5,TimeUnit.SECONDS, queue,factory,new CustomRejectionExecutionHandler());    
        for (int i = 1; i <=100; i++) {
            pool.submit(new Test());

        }
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    }    
}

class Test implements Runnable
{
    public void run()
    {
        System.out.println("Thread Running "+Thread.currentThread().getName());
    }
}


class CustomRejectionExecutionHandler implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
       System.out.println("Execution Rejected!");
    }
    
}