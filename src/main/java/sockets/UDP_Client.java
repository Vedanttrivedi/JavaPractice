package sockets;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDP_Client
{
    public static void main(String[] args) throws SocketException, IOException
    {
        DatagramSocket dgs = new DatagramSocket();
        String message = "Hii There";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dgp = new DatagramPacket(message.getBytes(),message.length(),ip,6666);
        dgs.send(dgp);
        dgs.close();
        
    }
}
