

class Animal_details extends Thread{
    public void animal_01() {
        String animal_name = "Name";
        String animal_color = "Color";
        String animal_age = "Age";
        String animal_price = "Price";
        System.out.println("Animal_Name"+animal_name);
        System.out.println("Animal_Color"+animal_color);
        System.out.println("Animal_Age"+animal_age);
        System.out.println("Animal_price"+animal_price);
    }
    public void animal_02() {
        String animal_name = "Name";
        String animal_color = "Color";
        String animal_age = "Age";
        String animal_price = "Price";
        System.out.println("Animal_Name"+animal_name);
        System.out.println("Animal_Color"+animal_color);
        System.out.println("Animal_Age"+animal_age);
        System.out.println("Animal_price"+animal_price);
    }
    public void animal_03() {
        String animal_name = "Name";
        String animal_color = "Color";
        String animal_age = "Age";
        String animal_price = "Price";
        System.out.println("Animal_Name"+animal_name);
        System.out.println("Animal_Color"+animal_color);
        System.out.println("Animal_Age"+animal_age);
        System.out.println("Animal_price"+animal_price);
    }
    public void animal_04() {
        String animal_name = "Name";
        String animal_color = "Color";
        String animal_age = "Age";
        String animal_price = "Price";
        System.out.println("Animal_Name"+animal_name);
        System.out.println("Animal_Color"+animal_color);
        System.out.println("Animal_Age"+animal_age);
        System.out.println("Animal_price"+animal_price);
    }
}
public class Animals {
    public static void main(String[] args) {
        Animal_details animalDetails = new Animal_details();
        animalDetails.start();
        System.out.println("Animal 01 details : ");
        animalDetails.animal_01();
        System.out.println("\nAnimal 02 details : ");
        animalDetails.animal_02();
        System.out.println("\nAnimal 03 details : ");
        animalDetails.animal_03();
        System.out.println("\nAnimal 04 details : ");
        animalDetails.animal_04();
    }
}