package CollectionFrameworkAll;

public class Book3 implements Comparable<Book3> {
    int id;
    String name, author, publisher;
    int quantity;

    public Book3(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int compareTo(Book3 b){
        if (id>b.id){
            return 1;
        }else if (id<b.id){
            return -1;
        }else {
            return 0;
        }
    }
}
