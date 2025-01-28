import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Full Name:");
        String fullName= sc.nextLine();
        System.out.println("Enter a Number:");
        int number1=sc.nextInt();

//        System.out.println("Enter Your 1st Name:");
//        String name= sc.next();

        System.out.println("The Entered Number is :"+number1);
//        System.out.println("Your Name is:"+name);
        System.out.println("Your Full name:"+fullName);
    }
}
