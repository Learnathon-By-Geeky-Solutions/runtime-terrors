package StaticExample;
class TestClass{
    static String name;

    public TestClass(String name) {
        TestClass.name = name;

    }

    @Override
    public String toString() {
        return name;
    }
}


 public class InnerClasses {

     //outside class cant be static
//      static  class TestClass{
//          String name;
//
//         public TestClass(String name) {
//             this.name = name;
//         }
//     }

     public static void main(String[] args) {
          TestClass T1=new TestClass("Sazid");
          TestClass T2=new TestClass("Mahin");
         System.out.println(T1.name);
         System.out.println(T2.name);
         //After adding tostring
         System.out.println(T1);


     }
}
//static class A
//{
//
//}

