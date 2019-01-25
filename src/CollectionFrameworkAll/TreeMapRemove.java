package CollectionFrameworkAll;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapRemove {
    public static void main(String[] args) {
        TreeMap<Integer,String>map=new TreeMap<Integer,String>();
        map.put(100, "Rita");
        map.put(102, "Ornob");
        map.put(101, "Nitu");
        map.put(106, "Rahul");
        map.put(104, "Tip");
        TreeMap<Integer,String>map2=new TreeMap<Integer,String>();
        map2.put(105,"Jomila");
        map2.putAll(map);
        for (Map.Entry m : map2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.remove(102);
        System.out.println("After invoking remove() method");
        for(Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Second Map check");
        for (Map.Entry m : map2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map2.remove(104);
        System.out.println("Second Map check After invoking remove() method");
        for (Map.Entry m : map2.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
