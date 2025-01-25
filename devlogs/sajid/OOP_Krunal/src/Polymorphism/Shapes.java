package Polymorphism;

public class Shapes {
    void area()
    {
        System.out.println("I am in shapes");
    }
//   early binding
    //also final can prevent inheritance
//    final void area()//we cant do that because final dont give opportunity of overriding
//    {
//        System.out.println("I am in shapes");
//    }
//Static method dont depend on object
    //overriding depends on object
    //so you cant override static

}
