package CollectionFrameworkAll;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        //Creating Deque and adding elements
        Deque<String> deque=new ArrayDeque<>();
        deque.add("Tamanna");
        deque.add("Ritu");
        deque.add("Suman");
        deque.add("Himel");
        //Traversing elements
        for (String str:deque){
            System.out.println(str);
        }
    }
}
