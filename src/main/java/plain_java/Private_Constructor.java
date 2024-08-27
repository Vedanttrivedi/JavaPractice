package sports;
class Demo
{
    private static Demo d;
    private Demo(){
        
    }

    public static Demo getInstance(){
        if(d==null)
        {
            d = new Demo();
            
        }
        return d;
    }
    public int getNum(){
        return 23;
    }
    
}

class Private_Constructor
{
    public static void main(String[] args)
    {
        Demo d = Demo.getInstance();
        System.out.println(d.getNum()); 
    }
}