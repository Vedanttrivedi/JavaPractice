import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket ss = new ServerSocket(6666);
            //Now If Multiple user wants to connect then use threads
            while(true)
            {
                Socket st = ss.accept();
                new Thread(new ThreadSocket(st)).start();
            }
        }
        catch (IOException ie)
        {
            System.err.println("Network Issue");
            System.err.println(ie);
        }
    }
}

class ThreadSocket implements Runnable
{
    Socket sct;
    ThreadSocket(Socket ss)
    {
        sct = ss;
    }
    @Override
    public void run()
    {
        try
        {
            DataInputStream bin = new DataInputStream(sct.getInputStream());
            DataOutputStream bos = new DataOutputStream(sct.getOutputStream());
            System.out.println("Connection Done!!!");
            String clientMessage="",serverMessage="";
            while(bin.readLine()!=null)
            {
                System.out.println("Me -> "+bin.toString());
            }
        }
        catch (IOException ie)
        {
            System.out.println("Inter class "+ie);
        }
    }
}