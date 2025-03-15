// package Static;
class demo
{
    // Static variable...........................................................................1.........(i)
    static int a;
    static int b;

    // Non Static variable...........................................................................2......(iv)
    int m;
    int n;
    
    // Static Block..................................................................................3.......(ii)
    static 
    {
        a=10;
        b=20;
        System.out.println("control thr static block");
    }

    //Non Static Block..................................................................................4
    {
        m=100;
        n=200;
        System.out.println("Control the Non static block");
    }

    //Static Methode.........................................................................................5
    static void display1()
    {
        System.out.println("Value of the static "+a);
        System.out.println("Value of the static "+b);
    }
    
    // non  static Static Methode.........................................................................................6
    void display2()
    {
        System.out.println("Value of the static "+m);
        System.out.println("Value of the static "+n);
    }

}

public class static_3 
{
    public static void main(String[] args) //.............................................................(iii)
    {
        demo  object=new demo();
        demo.display1();
        object.display2();
    }
}
