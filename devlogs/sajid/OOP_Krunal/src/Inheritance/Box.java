package Inheritance;

public class Box {
    double l;
    double h;
    double w;
//    double weight;

    public Box(double l, double h, double w) {
        //super() object class
        System.out.println("Box class constructor ");
        this.l = l;
        this.h = h;
        this.w = w;
    }

    //cube
    Box (double side){
        this.h=side;
        this.l=side;
        this.w=side;
    }
    Box ()
    {
        this.w=-1;
        this.l=-1;
        this.h=-1;
    }
    Box(Box old)
    {
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void DisplayInfo()
    {
        System.out.println("Running the box");
    }



}
