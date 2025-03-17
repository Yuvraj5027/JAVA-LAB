import java.util.Set;
import java.util.HashSet;
public class Practice {
    public static void main(String args[]){
        Set<String> animal=new HashSet<>();
        animal.add("Afraz");
        animal.add("Bird");
        animal.add("Cat");
        animal.add("Dog");
        animal.add("Lion");
        System.out.println(animal);
        for (String set:animal){
            System.out.println(set);
        }

    }
}
