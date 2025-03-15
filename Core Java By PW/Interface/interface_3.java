package Interface;
/*JAVA 8:-   Defult methode  in interface
 *          -Static Methode in interface
 *         - Functional in interface
 */

interface Aa
{
    void show(); //methode not define bcz interface concept

    //defult methode
    default void config() // but java 8 upade used defult keyword you declar 
    {
        System.out.println("we declar the interface using default  and craet object");
    }

    //static methode
    static void abc()
    {
        System.out.println("we call the directly withi out crat object");
    }

}

class Bb implements Aa
{
    public void show()
    {
        System.out.println("in show");
    }
}

public class interface_3 
{
    public static void main(String[] args) {
        Aa.abc();// bcz of statc keye word

        Aa a =new Bb();
        a.show();
        a.config();

    }

}
