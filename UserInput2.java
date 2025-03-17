import java.util.Scanner;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String n=sc.nextLine();
        System.out.println("Enter last name: ");
        String p=sc.nextLine();
        System.out.println("Enter ID ");
        int a=sc.nextInt();
        System.out.println("Enter Mark1 ");
        int b=sc.nextInt();
        System.out.println("Enter Mark2 ");
        int c=sc.nextInt();
        System.out.println("Student name is "+n+" "+p);
        System.out.println("Student id is "+a);
        System.out.println("Average is "+(b+c)/2);

    }
}
