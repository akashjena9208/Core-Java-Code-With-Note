package Fundamental;
public class operator1IncriDecri {

    public static void main(String[] args) {
        int a=5;
        int b=a++ + ++a + ++a + a++ + --a + a--;

        System.out.println(b);
        System.out.println(a);

        int c=5;
        int d=c++ + ++c + --c;

        System.out.println(d);
        System.out.println(c);

    }
    
}

