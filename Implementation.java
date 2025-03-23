interface Animal4 {
    void makeSound();
}
class Dog4 implements Animal4 {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Implementation {
    public static void main(String[] args) {
        Dog4 myDog = new Dog4();
        myDog.makeSound();
    }
}