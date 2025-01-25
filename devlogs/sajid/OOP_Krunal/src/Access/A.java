package Access;

public class A {
    private int num;
    String name;
    int[] array;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.array =new int[num];
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
