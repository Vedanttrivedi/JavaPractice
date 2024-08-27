package datatype;

public class TypeCasting 
{
    public static void main(String[] args)
    {
        byte a = 123;
        int b = a; //widening as lower data type is being promoted to higher data type
        System.out.println(b);

        float f = 12.5f;
        int data = (int)f; //narrowing as higher data type is being transferd to lower data type
        System.out.println(data);

        long value = Long.MAX_VALUE;
        int max_val = (int)value; //overflow of value  as the value cannot be stored in int
        System.out.println(max_val);


        byte bv1 = 12;
        byte bv2 = 124;
        //byte bv3 = bv1 + bv2; Compile time error, adding lower datatype

        byte bv3 = (byte)(bv1 + bv2);
        System.out.println(bv3);

                


    }  
    public boolean sample(){
        return (1==1)?true:false;
    } 

    public void practice(){
        String val1 = "hh";
        float val2 = 34.2f;

        switch (val1) {
            case "hh":
                System.out.println("executing");
                
            default:
            System.out.println("RRR");
                break;
        }
    }
}
