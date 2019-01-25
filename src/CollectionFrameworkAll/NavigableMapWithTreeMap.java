package CollectionFrameworkAll;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapWithTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer,String>map=new TreeMap<Integer, String>();
        map.put(100,"Rita");
        map.put(102,"Ornob");
        map.put(101,"Nitu");
        map.put(103,"Rahul");
        map.put(104,"roni");
        map.put(105,"Urmi");
        map.put(106,"Joy");
        map.put(107,"Rina");
        //Maintains descending order
        System.out.println("descendingMap:"+map.descendingMap());
        System.out.println("headMap: "+map.headMap(104,false));             //Returns key-value pairs whose keys are less than or equal to the specified key.
        System.out.println("tailMap: "+map.tailMap(104,true));            //Returns key-value pairs whose keys are greater than or equal to the specified key.
        System.out.println("subMap: "+map.subMap(103,true,106,false));      //Returns key-value pairs exists in between the specified key.
    }
}
