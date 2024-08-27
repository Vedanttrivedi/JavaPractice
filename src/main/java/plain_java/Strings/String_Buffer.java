package Strings;

public class String_Buffer
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Noice");
        sb.reverse();
        sb.delete(1, 2);
        System.out.println(sb.toString());    
    }    
}
