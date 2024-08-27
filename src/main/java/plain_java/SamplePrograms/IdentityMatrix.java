package SamplePrograms;

import java.util.Scanner;

public class IdentityMatrix 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();

        final int[][] arr = new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter elements for row : "+i);
            for(int j=0;j<m;j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }

        display(arr,n,m);
        boolean ans = isIdentity(arr,n);
        System.out.println(ans);
    }
    
    private static void display(int[][] arr,int n,int m)
    {
        System.out.println("Printing matrix elements ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }

            System.out.println();
        }
    }
    private static boolean isIdentity(int[][] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i][i]!=1)
                return false;
        }
        return true;
    }
        
}
