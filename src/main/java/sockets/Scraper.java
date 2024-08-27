package sockets;

import java.io.*;
import java.net.*;
public class Scraper {
    public static void main(String[] argURLConnectionExamples){
        try{
            URL url=new URL("https://www.motadata.com/");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int i;
            while((i=stream.read())!=-1){
                System.out.print((char)i);
            }
        }catch(Exception e){System.out.println(e);}
    }
}