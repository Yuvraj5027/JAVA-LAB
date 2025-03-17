import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a=sc.nextInt();
        System.out.println("Enter second number ");
        int b=sc.nextInt();
        System.out.println("The sum is : "+(a+b));
        System.out.println("The difference is : "+(a-b));
        System.out.println("The product is : "+(a*b));
        System.out.println("The division value is : "+(a/b));
    }
}
