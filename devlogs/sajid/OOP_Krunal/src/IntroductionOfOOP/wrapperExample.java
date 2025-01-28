package IntroductionOfOOP;

public class wrapperExample {
    public static void main(String[] args) {
//        int a=10;
////        Integer num1=new Integer(45);
////        Integer num=45;
////        System.out.println(num1+" "+num+" "+a);
//        int b=30;
//        Integer a=10;
//        Integer b=30;
//        swap(a,b);
//        System.out.println(a+" "+b);
////        final int bonus=2;
////        bonus=3;
        final A sazid=new A("sazid");
        sazid.name="Mahin";//this is ok .
        A obj;
        for (int i=0;i<1000000;i++)
        {
            obj= new A("Random Name");
        }
//        //When a non primitive is final you cannot reassign it
//        sazid=new A("Jemima");


    }
//   static void swap(int a,int b)
//    {
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a+" "+b);
//    }
static void swap(Integer a,Integer b)
{
    int temp=a;
    a=b;
    b=temp;
    System.out.println(a+" "+b);
}
static class A
{
//    final int num=10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
      super.finalize();
        System.out.println("Object is deleted");
    }
}

}
