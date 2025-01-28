package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box B1=new Box();
        System.out.println(B1.l+" "+ B1.h+" "+ B1.w);
        Box B2=new Box(4);
        System.out.println(B2.l+" "+ B2.h+" "+ B2.w);
        Box B3=new Box(1,2,3);
        System.out.println(B3.l+" "+ B3.h+" "+ B3.w);
        Box B4=new Box(B3);
        System.out.println(B4.l+" "+ B4.h+" "+ B4.w);
//        System.out.println(B1.weight); can't do that Parent class object can't access the child properties


    }
}
