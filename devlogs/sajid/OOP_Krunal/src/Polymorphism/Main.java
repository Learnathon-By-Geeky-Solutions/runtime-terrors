package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape =new Shapes();
        Circle circle=new Circle();
        Square square=new Square();
        //Runtime polymorphism
        //Dynamic polymorphism
        //same function and same parameter
        //gain by overriding
        shape.area();
        circle.area();
        square.area();
        Shapes square2=new Square();
        square2.area();
    }
}
