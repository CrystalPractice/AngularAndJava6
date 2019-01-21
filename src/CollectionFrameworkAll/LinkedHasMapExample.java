package CollectionFrameworkAll;



import java.util.LinkedHashMap;
import java.util.Map;


public class LinkedHasMapExample {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(100,"Amit");
        lhm.put(101,"Vijay");
        lhm.put(102,"Rahul");
        for(Map.Entry m:lhm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
