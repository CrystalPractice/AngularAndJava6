package CollectionFrameworkAll;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Tonni");
        queue.add("Rikta");
        queue.add("Joy");
        queue.add("Jahirul");
        queue.add("Runa");
        System.out.println("head:"+queue.peek());
        System.out.println("head:"+queue.element());
        System.out.println("Iterating the queue elements:");
        Iterator iterator=queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        queue.remove();
        System.out.println("After removing one elements:"+queue.element());
        queue.poll();
        System.out.println("After removing two elements:");
        Iterator iterator1=queue.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
