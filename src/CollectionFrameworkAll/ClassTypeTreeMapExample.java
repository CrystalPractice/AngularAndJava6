package CollectionFrameworkAll;

import java.util.Map;
import java.util.TreeMap;

public class ClassTypeTreeMapExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer,Book2>map=new TreeMap<Integer, Book2>();
        //Creating Books
        Book2 b1=new Book2(201,"Let us C","Yashwant Kanetkar","BPB",10);
        Book2 b2=new Book2(202,"Data Communications & Networking","Forouzan","Mc Graw Hill",40);
        Book2 b3=new Book2(203,"Operating System","Galvin","Wiley",60);
        //Adding Books to map
        map.put(1,b1);
        map.put(3,b3);
        map.put(2,b2);
        //Traversing map
        for (Map.Entry<Integer,Book2>entry2:map.entrySet()){
            int key=entry2.getKey();
            Book2 b=entry2.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

        }
    }
}
