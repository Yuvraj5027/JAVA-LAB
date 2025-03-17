class Child extends Thread{
    public void run(){
        System.out.println("This is Run Method");
    }
}
public class MainThread {
    public static void main(String args[]){
        Child c=new Child();
        c.start();
    }
}
