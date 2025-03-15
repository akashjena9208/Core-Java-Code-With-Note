package Interface;
/*
 * Inner class:-class inside the another class
 * a- Memeber innwwer class :-non static
 * b- Static inner class
 * c-Anonymous
 * 
 */
class Aaa 
{
    public void show()
    {
       System.out.println("Outer class"); 
    }
    class Bbb 
    {
            public void disp()
            {
                System.out.println("inner class merthode ");
            }
    }
}

public class innerclass 
{
    public static void main(String[] args) 
    {
        Aaa a = new Aaa();
        a.show();

        Aaa.Bbb b= a.new Bbb(); // inner class object

    }
}
