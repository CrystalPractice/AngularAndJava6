package JavaSixPractiseAll;

public class Icelandic extends Horse {
    public void makeNoise() {
        System.out.println("vinny");
    }
        public static void main(String[] args){
            Icelandic i1=new Icelandic();
            Icelandic i2=new Icelandic();
            Icelandic i3=new Icelandic();
            i3=i1;
            System.out.println(i3);
            i1=i2;
            System.out.println(i1);
            i2=null;
            System.out.println(i2);
            i3=i1;
            System.out.println(i3);


    }
}
