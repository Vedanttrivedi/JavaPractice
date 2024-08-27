package Strings;
//intern method is make sure that if the literal is not present then only add
//if the value is already present then use that only
// if used with new keyword then the follwing would happen:
// ->  new object will be created
// -> new object will point to that literal pool string

import java.util.Scanner;

public class Intern {
    public static void main(String[] args) {
        String s1 = "N";
        String s2= new String("N");
        String s3 = new String("N").intern();
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        

        String line = "123";
        int value = Integer.parseInt(line);//convert string to int return int
        int value2 = Integer.valueOf(line); //convert string to Integer return Integer

        String mvc = String.valueOf(value); 

    }
    
}

