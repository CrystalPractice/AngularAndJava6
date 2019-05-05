package CollectionFrameworkAll;

import java.util.HashSet;

public class HashSetWithClassType {
    public static void main(String[] args) {
        HashSet<Book> set=new HashSet<Book>();

        //Creating Books
        Book b1=new Book(1001,"Let us C","Yashwant Kanetkar","BPB",20);
        Book b2=new Book(1002,"Data Communications & Networking","Forouzan","Mc Graw Hill",44);
        Book b3=new Book(1003,"Operating System","Galvin","Wiley",23);

        //Adding Books to HashSet
        set.add(b1);
        set.add(b2);
        set.add(b3);

        //Traversing HashSet
        for (Book book:set){
            System.out.println(book.id+" "+book.name+" "+book.author+" "+ book.publisher+" "+book.quantity);
        }

    }
}
