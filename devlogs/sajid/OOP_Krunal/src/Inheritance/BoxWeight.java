package Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        //we cant initialize child class variable before super class
        //we cant do like this
        //this.weight =weight;
        //then  super(l,h,w) ;
        super(l, h, w);
        this.weight = weight;//child class weight variable
//        System.out.println(super.weight);//this refering to the parent class weight variable
    }

    public BoxWeight(double side, double weight) {
        super(side);//it is basicly saying that " Call the parent class constructor
        //Used to intialise the values present in the parent class
        //can't access the private members of parent class
        this.weight = weight;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }
}
