package CollectionFrameworkAll;

import java.util.TreeSet;

public class TreeSetLowesHighestExample {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(45);
        set.add(36);
        set.add(68);
        set.add(103);
        set.add(77);
        System.out.println("Highest Value: "+set.pollFirst());
        System.out.println("Lowest Value: "+set.pollLast());
    }
}
