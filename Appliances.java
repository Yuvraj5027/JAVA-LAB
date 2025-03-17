import java.util.Map;
import java.util.HashMap;
public class Appliances {
    public static void main(String args[]){
        Map<String,Integer> appliances=new HashMap<>();
        appliances.put("Mixer Grinder",4);
        appliances.put("Trimmer",2);
        appliances.put("Refrigerator",1);
        appliances.put("Hand Blender",2);
        appliances.put("Toaster",5);
        for(Map.Entry<String,Integer> entry: appliances.entrySet()){
            System.out.println("Appliances: "+entry.getKey()+":"+entry.getValue());
        }
    }
}
