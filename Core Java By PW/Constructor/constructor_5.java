package Constructor;

class Demo1
{
    //instance varibale
    int a;
    int b;

    //parant class constractor
    public Demo1()
    {
        System.out.println("Parant class Zero parmetter Constructor");
    }

    public Demo1(int x,int y)
    {
        System.out.println("Paramizezed Parant Constructor");
        int a=x;
        int b=y;
        System.out.println(a+" "+b);
        
    }
}
//child claass
class Demo2 extends Demo1
{
    int m,n;

    public Demo2()  
    { 
        // either super methode call or this methode call
        //super();  //by defult

        this(10, 20);
        System.out.println("Child  class Zero parmetter Constructor");
    }
    
    public Demo2(int x,int y)
    {
        //super() bcz it is zero call the parmiezd
        super(10,20); // call parent
        System.out.println("Child class  Paramizied Constructor");
        m=x;
        n=y;
        System.out.println(m+" "+n);
    }


}
public class constructor_5
{
    public static void main(String[] args) 
    {
        Demo2 D = new Demo2(); // zero paramized constructor call
        System.out.println("...................................");
        Demo2 D2 = new Demo2(5,10);
    }
}
