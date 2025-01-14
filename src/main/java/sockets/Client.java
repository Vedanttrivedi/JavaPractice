package sockets;

import java.io.*;
import java.net.Socket;

public class Client
{
    public static void main(String args[])
    {
        try
        {
            Socket s=new Socket("localhost",6666);
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str="",str2="";
            while(!str.equals("stop"))
            {
                str=br.readLine();
                dout.writeUTF(str);
                dout.flush();
                str2=din.readUTF();
                System.out.println("Server: "+str2);
            }

            dout.close();
            s.close();
        }
        catch (IOException ie)
        {
            System.out.println(ie);
        }
    }
}
