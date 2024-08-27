package OOPS;

public class OverLoading {
    private  static void take(long val){
        System.out.println(val);
    }
    public static void main(String[] args) {
        take(Long.MAX_VALUE);
        
    }

    void sum(int a,long b){System.out.println("a method invoked");}  
    //void sum(long a,int b){System.out.println("b method invoked");}  
    
    public static void main(int args){  
    OverLoading obj=new OverLoading();  
    obj.sum(20,20);//now ambiguity  
    }  
  

}
