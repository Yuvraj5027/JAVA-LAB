class Animal3 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog3 extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal3 {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Dog3 D = new Dog3();
        D.makeSound();
        Cat C = new Cat();
        C.makeSound();
    }
}