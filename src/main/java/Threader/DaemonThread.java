package Threader;

public class DaemonThread
{
    public static void main(String[] args)
    {
        Thread userThread = new Thread(()-> {
            for(var i=1;i<=10;i++)
            {
                System.out.println("User Thread "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread daemonThread = new Thread(()-> {
            for(var i=1;i<=100;i++)
            {
                System.out.println("Daemon Thread "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        daemonThread.setPriority(Thread.MAX_PRIORITY);//Thread Priority only means that thread schedular give more preference to this thread for executing
        System.out.println("main method finished");


    }

}


