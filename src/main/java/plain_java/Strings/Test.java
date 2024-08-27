package Strings;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] ch = {'H','e','l','l','o'};
        String newstr = new String(ch);

        System.out.println(str.contains("ello"));
        System.out.println(str.substring(1, 3));
        System.out.println(str);


        StringJoiner sj = new StringJoiner("!");
        sj.add("Hello");
        sj.add("World");
        System.out.println(sj);
    
        String str2 = "hello";
        System.out.format("%s", str2);
    
    }    
}
