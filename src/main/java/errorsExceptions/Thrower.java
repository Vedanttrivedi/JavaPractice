package errorsExceptions;

class UnderAgeException extends Exception
{
    UnderAgeException()
    {
        super("You are Underage!");
    }
}


public class Thrower
{
    public static  void validate(int age) throws UnderAgeException {
        if(age < 20)
            throw new UnderAgeException();
    }
    public static void main(String[] args)
    {
        double num=12/0.0;
        System.out.println(num);
        System.out.println("Checked");
    }
}
//when we divide the 0/0 and if its datatype is double then it will be NAN
//when we divide the positive double number with 0 then it will be infinity