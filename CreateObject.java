class MyClass {
    void printMessage() {
        System.out.println("Hello, this is a message from MyClass!");
    }
}

public class CreateObject {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.printMessage();
    }
}