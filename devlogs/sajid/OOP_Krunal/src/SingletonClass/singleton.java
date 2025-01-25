package SingletonClass;

public class singleton {
    private int num=0;

    private singleton()
    {

    }
    private static singleton instance;
    public static singleton getInstance(){
        //check whether 1 obj is created or not
        if(instance==null)
        {
            instance=new singleton();
        }
        return instance;
    }


}
