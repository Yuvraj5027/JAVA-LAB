abstract class Star {
    abstract void printInfo();
}
class Employee extends Star {
    void printInfo() {
        String name = "Avinash";
        int age = 21;
        float salary = 222.2F;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
public class Abstraction {
    public static void main(String args[]) {
        Star s = new Employee();
        s.printInfo();
    }
}