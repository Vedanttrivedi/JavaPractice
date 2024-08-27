package oops;

public class Diamond_Problem
{
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();

        //way 1 for solving
        DogCat dc1 = new DogCat();
        c1.display();
        d1.display();
        dc1.display();


        //way 2 for solving
        UpdatedAnimal ua1= new UpdatedAnimal();
        ua1.display();
        System.out.println();
    }
}


class Animal
{
    String name;
    int age;
    public void display(){
        System.out.println("Display Called From ANimal!");
    }
}

class Dog extends  Animal
{
    @Override
    public void display()
    {
        System.out.println("Called From Dog");
    }
}

class Cat extends  Animal implements CatAnimal
{
    @Override
    public void display()
    {
        System.out.println("Called From Cat");
    }
}


/*
* Below Code causes diamond problem both
* Dog and Cat are extending Animal which is Hybrid Inheritance
* And Then DogCat is trying to implement Dog,Cat which is multiple in heritance
* which is not supported as java will be confused which display method to called
* */
//
// class DogCat extends Dog,Cat
//{
//    @Override
//    public void display(){
//        System.out.println("Called from Dogcat");
//    }
//}

/*
* Ways to solve
* 1)Method 1 : Implement One class and One interface
*            : And the class which you cannot extend like here cat
*             : Create Cat interface and then make sure that Cat class implemetns it
*             : This way we can achieve both Dog, Cat behaviours
* */

interface CatAnimal
{
    int a=23;
    public default void display()
    {
        System.out.println("This interface is made for cat");
    }

    public default  void meow()
    {
        System.out.println("this is cat meow");
    }
}

class DogCat extends  Dog implements CatAnimal
{
    @Override
    public void display()
    {
        CatAnimal.super.display();
    }
}


//Method 2: Declare Both Interface
interface DogAnimal
{

    public default void display()
    {
        System.out.println("Display Method called of Dog!");
    }
    public default void bite()
    {
        System.out.println("hello dog method");
    }
}

class UpdatedAnimal implements DogAnimal,CatAnimal
{
    @Override
    public void display()
    {
        //here we can control which method we want to call
        DogAnimal.super.display();
        CatAnimal.super.display();
    }
}


