import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int length = sc.nextInt();
        System.out.println("Enter Breadth ");
        int breadth = sc.nextInt();
        System.out.println("Area is "+(length*breadth)+"sqm");
        System.out.println("Perimeter is "+(2*(length+breadth))+"sqm");
    }
}
