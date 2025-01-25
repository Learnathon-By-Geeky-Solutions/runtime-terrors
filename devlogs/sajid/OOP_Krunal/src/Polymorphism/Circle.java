package Polymorphism;

public class Circle extends Shapes{

    @Override
    //this will run when obj of circle is created
    //hence it is overriding the parent method

    void area()
    {
        System.out.println("Area is 3.14*radius*radius");
    }
}
