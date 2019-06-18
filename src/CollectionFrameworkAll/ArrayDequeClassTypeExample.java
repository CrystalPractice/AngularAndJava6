package CollectionFrameworkAll;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClassTypeExample {
    public static void main(String[] args) {
        Deque<Book> setBook=new ArrayDeque<Book>();

        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        Book b4=new Book(104,"Software Engineering","Steve McConnell","Oxford",9);

        //Adding Books to Deque
        setBook.add(b1);
        setBook.add(b2);
        setBook.add(b3);
        setBook.add(b4);

        //Traversing ArrayDeque
        for (Book b:setBook){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
