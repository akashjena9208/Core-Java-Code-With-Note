package Inheritance;
       //MULTILEVEL INHERITANCE:-A class extend another class  that already extend another class
class Demo1
{
  void dis()
  {
    System.out.println("it is multilvel inheritance");
  }
}
class  Demo2 extends Demo1
{

}
class Demo3 extends Demo2
{
    
}

public class inheritance_4
{
    public static void main(String[] args) 
    {
        Demo3 d=new Demo3();
        d.dis();
    }
}
