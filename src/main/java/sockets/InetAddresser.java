package sockets;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddresser
{
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ina = InetAddress.getByName("https://www.motadata.com");
        System.out.println(ina.getAddress());
    }
}
