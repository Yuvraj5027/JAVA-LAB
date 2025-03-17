import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Kiwi");
        list.add("Grape");
        list.add("Orange");
        System.out.println("FRUITS LIST");
        System.out.println("-----------");
        System.out.println(list);
        //Implementation of list 1
        String find=list.get(3);
        System.out.println("Using index: "+find);
        //Implementation of list 2
        list.remove("Banana");
        System.out.println(list);
        //implementation of list 3
        for(String Fruits:list) {
            System.out.println(Fruits);
        }
   }
}





