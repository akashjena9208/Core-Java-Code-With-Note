package Interface;
class Demoo 
{
    public void disp()
    {
        System.out.println("single methode of a clss");
    }
}
public class interface_7 
{
    public static void main(String[] args)
    {
        Demoo d= new Demoo();
        d.disp();


        //Anonimoues 

        // Demoo t= new Demoo();
        // t.disp();
        new Demoo().disp();
    }
}
