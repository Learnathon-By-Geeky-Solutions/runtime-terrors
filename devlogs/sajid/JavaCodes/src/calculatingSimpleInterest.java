import java.security.Principal;
import java.util.Scanner;
public class calculatingSimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle:");
        double principle= sc.nextDouble();
        System.out.println("Enter %Interest Rate:");
        double interestRate=sc.nextDouble();
        System.out.println("Enter Year:");
        double year= sc.nextDouble();
        double interest= principle*interestRate*0.01*year;
        System.out.println("Simple Interest Is: "+interest);
    }
}
