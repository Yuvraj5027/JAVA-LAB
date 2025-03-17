import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter princial amount ");
        int a=sc.nextInt();
        System.out.println("Enter No. of years ");
        int b=sc.nextInt();
        System.out.println("Enter Rate of interest ");
        int c=sc.nextInt();

        System.out.println("Total Interest: "+(a*b*c)/100+"Rs");
        System.out.println("Total Amount: "+(a+(a*b*c)/100)+"Rs");
    }
}
