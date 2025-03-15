package Interface;
/*
 
 * b- Static inner class
 * 
 * 
 */
class Aaaa 
{
    public void show()
    {
       System.out.println("Outer class"); 
    }
   static class Bbbb 
    {
            public void disp()
            {
                System.out.println("inner class merthode ");
            }
    }
}

public class innerclass_1
{
    public static void main(String[] args) 
    {
        Aaaa a = new Aaaa();
        a.show();

        Aaaa.Bbbb b= new Aaaa.Bbbb(); // inner class of static object

    }
}
