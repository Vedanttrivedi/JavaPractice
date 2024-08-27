package datatype;

public class Variables
{
    public static int data = 12;
    public static void main(String[] args)
    {
        boolean flag=true;
        byte by = 127;
        short st = 32000;
        char sh = 'A';
        int in = 65430;
        float ft = 23.45f;
        double dd = 23.45;
        long ll = Long.MAX_VALUE;
        int a = 12;
        int t,y,u;
        t=y=u=12; //chain assignment
            try {
              System.out.println("Noice "+args[0]);
            } catch (ArrayIndexOutOfBoundsException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }


    }
}


/*
We can set the package path if it is in different directory using
set classpath=directory_path  //by setting env variable in terminal

or
java -classpath location package.class
java -classpath /home/vedant/testing datatype.Varibles



*/