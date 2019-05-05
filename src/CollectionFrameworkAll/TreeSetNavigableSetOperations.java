package CollectionFrameworkAll;

import java.util.TreeSet;

public class TreeSetNavigableSetOperations {
    public static void main(String[] args) {
        TreeSet<String> set=new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        System.out.println("Initial Set: "+set);
        System.out.println("Reverse Set: "+set.descendingSet());
        System.out.println("Head Set: "+set.headSet("C",true));
        System.out.println("SubSet: "+set.subSet("A",true,"D",false));
        System.out.println("TailSet: "+set.tailSet("C",false));

    }
}
