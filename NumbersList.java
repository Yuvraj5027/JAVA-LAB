import java.util.ArrayList;
import java.util.List;

public class NumbersList {
    public static void main(String args[]){
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Numbers");
        System.out.println("--------");
        //System.out.println(list);
        int find_num=list.get(4);
        System.out.println(find_num);

        for(Integer num:list){
            //System.out.println(num);
        }
    }
}
