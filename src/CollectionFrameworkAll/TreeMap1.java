package CollectionFrameworkAll;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,String>map=new TreeMap<Integer, String>();
        map.put(100,"Rita");
        map.put(102,"Ornob");
        map.put(101,"Nitu");
        map.put(103,"Rahul");
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
