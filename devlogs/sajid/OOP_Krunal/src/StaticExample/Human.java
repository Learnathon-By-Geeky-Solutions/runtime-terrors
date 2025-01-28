package StaticExample;

public class Human {
    int age;
    String name;
    long salary;
    boolean married;
     static long population;
     static void message()
     {
         System.out.println("This is a message.");
        // System.out.println(this.age);can't use this over here.
     }

    public Human(int age, String name, long salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;//Because for static variable we can't use this.Rather we use class name
//        this.message();we won't use that although it is correct Rather we will do that
        Human.message();
        //or we will do it like that
        //message();
    }
}
