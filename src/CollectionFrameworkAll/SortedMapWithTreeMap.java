package CollectionFrameworkAll;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapWithTreeMap {
    public static void main(String[] args) {
        SortedMap<Integer,String>map=new TreeMap<Integer, String>();
        map.put(100,"Rita");
        map.put(102,"Ornob");
        map.put(101,"Nitu");
        map.put(103,"Rahul");
        map.put(105,"roni");
        map.put(104,"Urmi");
        map.put(106,"Joy");
        map.put(107,"Rina");
        //Returns key-value pairs whose keys are less than the specified key.
        System.out.println("headMap: "+map.headMap(104));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("tailMap: "+map.tailMap(104));
        //Returns key-value pairs exists in between the specified key.
        System.out.println("subMap: "+map.subMap(103,106));
    }
}
