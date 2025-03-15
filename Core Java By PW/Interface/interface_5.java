package Interface;
interface demo1
{
    void calc(); // functional  single interface bcz onyly one abstract methode
}
interface demo2 // functional multipule inter face bcz  multipule  abstrasct are used
{
    void add();
    void sub();
}
class calu implements demo1,demo2
{
    public void calc()
    {
        System.out.println("it is a Functional interface");
        int a=10;
        int b=20;
        int res=a*b;
        System.out.println(res);
    }
    public void add()
    {
        System.out.println("it is a multipule inter face");
        int a=10;
        int b=20;
        int res=a+b;
        System.out.println(res);
    }
    public void sub()
    {
        System.out.println("it is a multipule interface");
        int a=10;
        int b=20;
        int res=a-b;
        System.out.println(res);
    }
}

public class interface_5 
{
    public static void main(String[] args) 
    {
        calu c = new calu();
        c.calc();
        c.add();
        c.sub();
    }
}
