class Box
{
    double hight;
    double width;
    double depth;

    Box() {
        hight=2;
        width=3;
        depth=4;
    }
    void volume()
    {
        System.out.println("Volume is:"+hight*depth*width);
    }

}

public class ConstructorUnd {
    public static void main(String[] args) {
        Box boxA=new Box();
        boxA.volume();
        boxA.hight=10;
        boxA.width=10;
        boxA.depth=10;
        boxA.volume();
    }
}
