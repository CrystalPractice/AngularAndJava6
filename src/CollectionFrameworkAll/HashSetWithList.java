package CollectionFrameworkAll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetWithList {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Toma");
        list.add("Tomal");
        list.add("Tomalika");
        list.add("Tonni");
        HashSet set=new HashSet(list);
        set.add("Mili");
        Iterator<String> i=set.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
