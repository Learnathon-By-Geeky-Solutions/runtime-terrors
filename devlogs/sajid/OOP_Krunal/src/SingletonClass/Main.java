package SingletonClass;

public class Main {
    public static void main(String[] args) {
       // singleton obj=new singleton();
        //But if we make singleton private we won't be able to access it .
        singleton obj1=singleton.getInstance();
        singleton obj2=singleton.getInstance();
        singleton obj3=singleton.getInstance();
        //all 3 reference variable are pointing to just one object
    }
}
