package java8;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Car{
    public void drive();
}

@FunctionalInterface
interface OfficeCheckInOut{
    public void log(String start,String end);

}
@FunctionalInterface
interface Shape{
    public void draw(String name);
}

public class Lambda {
    static  int value=12;
    public static void main(String[] args) {
        //without lambda expression
        int val=12;
        Car c = new Car(){
          @Override
          public void drive(){
              System.out.println("Drive Method");
          }
        };
        c.drive();

        //using lambda expression
        Car cs = () ->{
            System.out.println("New Drive "+value);
        };
        cs.drive();
        //method with two parameters
        OfficeCheckInOut oci = (String start,String end) -> {
            System.out.println("TIme Looged");
        };
        oci.log("11","7");
        //method with only one parameter
        String shapename = "Circle";
        //no need of parenthesis
        Shape sn = name ->System.out.println("Name");


        //lambda with foreach

        List<String> names = new ArrayList<>();
        names.add("A");
        names.add("B");

        names.forEach( name ->{
            System.out.println("name "+name);
        });
        //Threads without lambda


        Runnable rnb = new Runnable() {
            @Override
            public void run() {
                System.out.println("Clling");
            }
        };
        Thread t1= new Thread(rnb);
        t1.start();

        //lambda with thread
        Runnable rcb = ()-> {
            System.out.println("new one");
        };
        Thread t3 = new Thread(rcb);
        t3.start();
    }
}
