package Performance;
//Performance testing program for string vs stringbuffer
//Stringbuffer is faster than string
//Stringbuilder is faster than stringbuffer
public class StringBufferVsString {
    
    private static void concatString(String s)
    {
        for(int i=0;i<100000;i++)
            s = s+ "Noice";
    }

    private static void contactBuffer(StringBuffer sb)
    {
        for(int i=0;i<100000;i++)
            sb.append("Noice");
    }
    private static void contactBuilder(StringBuilder sbs)
    {
        for(int i=0;i<100000;i++)
            sbs.append("Noice");
    }
    
    public static void main(String[] args)
    {
        String s = "A";
        long timeBefore = System.currentTimeMillis();
        
        concatString(s);    
        System.out.println("Time For String in MS: "+ (System.currentTimeMillis() - timeBefore));
        long timeBufferNew = System.currentTimeMillis();
        contactBuffer(new StringBuffer());
        System.out.println("Time For StringBuffer in MS : "+ (System.currentTimeMillis() - timeBufferNew));
        long timeBuilderNew = System.currentTimeMillis();
        contactBuilder(new StringBuilder());
        System.out.println("Time For StringBuilder in MS : "+ (System.currentTimeMillis() - timeBuilderNew));

        boolean isUpper = s.charAt(0) >=65 && s.charAt(0) <=90;
        System.out.println(isUpper); 
        
        B b = new B();
        A a = new A();
        b.add(12, 12);
        System.out.println(b instanceof A);
        A f = new B();
        System.out.println(f.speed);
        f.add(12, 120);
    }
    
}


class A{
    int speed=12;    
    public void add(int a,int b){
        System.out.println("Called From A");
    }
}
class B extends A{
    int speed =13;
    public void add(int d,int c ){
        System.out.println("Called From B");
    }
}