import java.util.List;
import java.util.ArrayList;

public class CitiesList {
    public static void main(String args[]){
        List<String> Cities=new ArrayList<>();
        Cities.add("Bangalore");
        Cities.add("Mumbai");
        Cities.add("Ranchi");
        Cities.add("Pune");
        Cities.add("Chennai");
        Cities.add("Hyderabad");
        System.out.println("Cities Name: "+Cities);

        Cities.remove("Hyderabad");
        System.out.println("Removed Biryani: "+Cities);

        String find=Cities.get(2);
        System.out.println("Thala: "+find);

        for(String city:Cities){
            System.out.println("For loop: "+city);
        }
    }
}
