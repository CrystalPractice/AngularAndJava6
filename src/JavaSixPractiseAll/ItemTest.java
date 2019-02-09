package JavaSixPractiseAll;

public class ItemTest {
    private final int id;
    private int id3;
    public ItemTest(int id) { this.id = id; }
    public void updateId(int id2){
        this.id3=id2;
        System.out.println(id3);
    }


    public static void main(String[] args) {
        ItemTest fa = new ItemTest(45);
        ItemTest fa2 = new ItemTest(24);
        System.out.println(fa.id);
        System.out.println(fa2.id);
        fa2.updateId(99);
        System.out.println(fa.id);
        System.out.println(fa2.id);

    }
}
