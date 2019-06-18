package CollectionFrameworkAll;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();
        deque.add("Tamanna");
        deque.add("Ritu");
        deque.add("Suman");
        deque.add("Himel");
        deque.add("Mahi");
        deque.add("Pori");
        deque.add("dip");

        deque.offerFirst("Jibon");
        System.out.println("After offerFirst Traversal...");
        for (String str:deque){
            System.out.println(str);
        }

        deque.poll();
        deque.pollFirst();     //it is same as poll()
        System.out.println("After poll Traversal...");
        for (String s2:deque){
            System.out.println(s2);
        }
        System.out.println("After pollLast() Traversal...");
        deque.pollLast();
        for (String s3:deque){
            System.out.println(s3);
        }
    }
}
