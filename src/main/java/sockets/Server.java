package sockets;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket ss=new ServerSocket(6666);

            System.out.println("Server is Accepting the connection .....");
            Socket s=ss.accept();
            System.out.println("Client Connected!");
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String str="",str2="";
            while(!str.equals("stop"))
            {
                str=din.readUTF();
                System.out.println("client says->"+str);
                str2=br.readLine();
                dout.writeUTF(str2);
                dout.flush();
            }
            din.close();
            s.close();
            ss.close();
        }
        catch (IOException ie)
        {
            System.out.println(ie);
        }
    }

}