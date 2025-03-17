import java.util.Scanner;

public class DollarCent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dollar 1");
        int d1 = sc.nextInt();
        System.out.println("Enter cent 1");
        int c1 = sc.nextInt();
        System.out.println("Enter dollar 2");
        int d2 = sc.nextInt();
        System.out.println("Enter cent 2");
        int c2 = sc.nextInt();
        int e=(c1+c2)/100;

        System.out.println("Total dollar \n"+((d1+d2)+e));
        System.out.println("Total cent \n"+((c1+c2)%100));
    }
}
