package Inheritance;

public class AnotherMain {
    public static void main(String[] args) {
    BoxWeight B1=new BoxWeight();
        System.out.println(B1.h+" "+ B1.weight);
        //parent class in referencing to child class
        Box B2=new BoxWeight(2,3,4,8);
        System.out.println(B2.l);//we can access the attributes of Box class
        //But we cant do that below
//        System.out.println(B2.weight);
        //Let's Try that
        //there are many variables in both parent and child class
        //you are given access to variables that are in the ref type i.e boxWeight
        //hence you should access to weight have access to weight variable
        //this also means that the one you are trying to access should be initialised
        //we cant do that
//        BoxWeight B3=new Box(1,2,3,4);


    }
}
