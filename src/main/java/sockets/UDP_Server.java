package sockets;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP_Server
{
    public static void main(String[] args) throws SocketException , IOException {
        DatagramSocket dgs = new DatagramSocket(4000);
        byte[] packetSize = new byte[1024];
        DatagramPacket dgp = new DatagramPacket(packetSize,1024);
        dgs.receive(dgp);
        String liner = new String(dgp.getData(),0,dgp.getLength());
        System.out.println("Udp client "+liner);
        dgs.close();
    }
}
