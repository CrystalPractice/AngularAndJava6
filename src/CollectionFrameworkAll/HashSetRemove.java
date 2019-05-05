package CollectionFrameworkAll;

import java.util.HashSet;

public class HashSetRemove {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();
        set.add("Milon");
        set.add("Himel");
        set.add("Riku");
        set.add("Titu");
        set.add("Jalil");
        System.out.println("An initial list of elements: "+set);
        //Removing specific element from HashSet
        set.remove("Titu");
        System.out.println("After invoking remove(object) method: "+set);
        HashSet<String> set1=new HashSet<String>();
        set1.add("Suma");
        set1.add("Ruma");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Jalil"));
        System.out.println("After invoking removeIf() method: "+set);
        //Removing all the elements available in the set
        System.out.println("Before invoking clear() method: "+set.size());
        set.clear();
        System.out.println("After invoking clear() method: "+set.size());
    }
}
