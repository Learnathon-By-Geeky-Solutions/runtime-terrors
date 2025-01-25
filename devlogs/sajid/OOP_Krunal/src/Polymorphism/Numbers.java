package Polymorphism;

public class Numbers {
    //compile time polymorphism
    //Achieved by method overloading
    //overloading meands same named with diff parameter list
    int sum(int a,int b)
    {
        System.out.println("I am a integer return type method");
        return a+b;
    }
    double sum(double a,double b)
    {
        System.out.println("I am a double return type method");
        return a+b;
    }

    int sum(int a,int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        System.out.println(obj.sum(1,2));
        System.out.println(obj.sum(1,2,3));
    }

}
