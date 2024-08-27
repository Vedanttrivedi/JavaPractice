package oops;

public class Copy_Constructor {
    static int value;
    static {
        value=23;
    }
    public static void main(String[] args) {
        Car c1 = new Car(value);
        Car c2 = new Car(c1);
        c2.printDetail();
    }
}

class Car{
    private int age;
    Car(int age){
        this.age = age;
    }
    Car(Car c){
        age = c.age;
    }
    void printDetail(){
        System.out.println(this.age);
    }
}
