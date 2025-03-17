import java.util.Scanner;
class Animal extends Thread{
    public void animal1(){
        Scanner s=new Scanner(System.in);
        String animal_name ;
        String animal_color ;
        double animal_age;
        double animal_price ;
        System.out.println("Enter Animal 1 Name:");

        animal_name= s.next();
        System.out.println("Enter Animal 1 Color");
        animal_color=s.next();


        System.out.println("Animal 1 Age");
        animal_age=s.nextDouble();
        System.out.println("Animal 1 price (in rupees)");
        animal_price=s.nextDouble();
    }
    public void animal2(){
        Scanner s=new Scanner(System.in);
        String animal_name ;
        String animal_color ;
        double animal_age;
        double animal_price ;
        System.out.println("Enter Animal 2 Name:");

        animal_name= s.next();
        System.out.println("Enter Animal 2 Color");
        animal_color=s.next();


        System.out.println("Animal 2 Age");
        animal_age=s.nextDouble();
        System.out.println("Animal 2 price");
        animal_price=s.nextDouble();
    }
    public void animal3(){
        Scanner s=new Scanner(System.in);
        String animal_name ;
        String animal_color ;
        double animal_age;
        double animal_price ;
        System.out.println("Enter Animal 3 Name:");

        animal_name= s.next();
        System.out.println("Enter Animal 3 Color");
        animal_color=s.next();


        System.out.println("Animal 3 Age");
        animal_age=s.nextDouble();
        System.out.println("Animal 3 price");
        animal_price=s.nextDouble();
    }
    public void animal4(){
        Scanner s=new Scanner(System.in);
        String animal_name ;
        String animal_color ;
        double animal_age;
        double animal_price ;
        System.out.println("Enter Animal 4 Name:");

        animal_name= s.next();
        System.out.println("Enter Animal 4 Color");
        animal_color=s.next();


        System.out.println("Animal 4 Age");
        animal_age=s.nextDouble();
        System.out.println("Animal 4 price");
        animal_price=s.nextDouble();
    }
    public void animal5(){
        Scanner s=new Scanner(System.in);
        String animal_name ;
        String animal_color ;
        double animal_age;
        double animal_price ;
        System.out.println("Enter Animal5_Name:");

        animal_name= s.next();
        System.out.println("Enter Animal5_Color");
        animal_color=s.next();


        System.out.println("Animal5_Age");
        animal_age=s.nextDouble();
        System.out.println("Animal5_price");
        animal_price=s.nextDouble();
    }

}
public class Animals_Details {
    public static void main(String args[]){
        Animal animalDetails = new Animal();
        animalDetails.start();
        System.out.println("Animal 01 details : ");
        animalDetails.animal1();

        System.out.println("\nAnimal 02 details : ");
        animalDetails.animal2();
        System.out.println("\nAnimal 03 details : ");
        animalDetails.animal3();
        System.out.println("\nAnimal 04 details : ");
        animalDetails.animal4();
        System.out.println("\nAnimal 05 details : ");
        animalDetails.animal5();

    }
}
