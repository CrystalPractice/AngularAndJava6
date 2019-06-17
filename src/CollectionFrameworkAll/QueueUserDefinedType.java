package CollectionFrameworkAll;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueUserDefinedType {
    public static void main(String[] args) {
        Queue<Book3> queue=new PriorityQueue<Book3>();

        //Creating Books
        Book3 b1=new Book3(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book3 b2=new Book3(233,"Operating System","Galvin","Wiley",6);
        Book3 b3=new Book3(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        //Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");

        //Traversing queue elements
        for (Book3 b:queue){
            System.out.println(b.id+" "+b.name+"  "+b.author+" "+b.publisher+b.quantity);
        }
        queue.remove();
        System.out.println("After removing one book record:");
        for (Book3 book3:queue){
            System.out.println(book3.id+" "+book3.name+"  "+book3.author+" "+book3.publisher+book3.quantity);
        }
    }
}
