package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Sazid=new Human(22,"Sazid",1000,false);
        Human Mahin=new Human(12,"Mahin",1000,true);
        System.out.println(Mahin.name);
        System.out.println(Sazid.population);
        System.out.println(Mahin.population);
        Human Jemima=new Human(22,"Jemima",10000,true);
        System.out.println(Jemima.population);
        System.out.println(Sazid.population);
        greeting();
        fun();
//        fun2();
//      greeting2();
//      we can't do this because we can't access non static from an static function
    }
    //We know that something which is not static ,belongs to an object
    static void greeting()
    {
        System.out.println("Hello static");
    }
    static void fun()
    {
        greeting();
    }

    static void fun2()
    {
        greeting();
       // greeting2();
        // Main.greeting you can't use this because it requires an instance
        //but the function you are using it in does not depend on instance
        //But there is a way to do that
        //You cannot access a not static stuff without refrencing their instances in a static contex
        //hence I am referencing It .
        Main obj=new Main();
        obj.greeting2();

    }
    void greeting2()
    {
        fun();//an static can be inside a non static method
        System.out.println("This is not static");
    }




}
