import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UserInput1 {
    public static void main(String args[]) {
        int a,b;
        float c;
        String d;
        char e;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the first Int number");
        a=x.nextInt();
        System.out.println("Enter the second Int number");
        b=x.nextInt();
        System.out.println("Enter the Float value");
        c=x.nextFloat();
        System.out.println("Enter the String value");
        d=x.next();
        System.out.println("Enter the character");
        e=x.next().charAt(0);
        System.out.println("The sum of "+ a + " And " + b+ " is " +(a+b));
        System.out.println(c+"\n"+d+"\n"+e);
    }
}

