import java.util.Map;
import java.util.HashMap;
public class New {
    public static void main(String args[]){
        Map <String,Integer> country= new HashMap<>(); //Creating Empty Map
        System.out.println("Country Details");
        System.out.println("------------------");
        country.put("India",1);
        country.put("USA",2);
        country.put("Australia",3);
        System.out.println("Countries: "+country);
        for(Map.Entry<String,Integer> entry:country.entrySet()){
            System.out.println("Countries: "+ entry.getKey()+":"+entry.getValue());

        }
    }
}
