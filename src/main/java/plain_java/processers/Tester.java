package processers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Tester
{

    public static void main(String[] args) 
    {
        boolean flag=true;
        Scanner scan = new Scanner(System.in);
        while(flag)
        {
            try
            {
                System.out.println("Enter 1 For Single Ip , 2 For Ip Range(exa -> 192.168.29.1/24))");
                int input = scan.nextInt();
                if(input==1)
                {
                    System.out.print("Enter the Ip address : ");
                    String ip = scan.next();
                    boolean isPingable = isPingable(ip);
                    System.out.println(ip+ " is " + (isPingable ? " Up!" : "Down!"));
                }
                else
                {
                    System.out.println("Enter the ip range : ");
                    String ip = scan.next();
                    
                    String [] ipAndSubnet = ip.split("/");

                }
                flag=false;
            }
            catch(InputMismatchException  ie)
            {
                System.out.println(ie.getMessage());
            }
        }
    }

    private static boolean isPingable(String ip)
    {
        try 
        {
            ProcessBuilder processBuilder = new ProcessBuilder("fping", "-c", "5", ip);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            System.out.println("Codeed");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = reader.readLine();
            
            while ((line = reader.readLine()) != null)
            {
               if(line.contains("0% loss"))
               {
                return true;
               }
               line=reader.readLine();
            }
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        return false;
    }

}
