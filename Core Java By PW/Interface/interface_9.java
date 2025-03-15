package Interface;

// abstract class Computer
// {
//    abstract public void compilecode();
//     // {
              //  define
//     // }
// }
interface Computer
{
   abstract public void compilecode();
    
}

class Laptop implements Computer
{
    public void compilecode()
    {
        System.out.println("you got thr 10 error");
    }
}

class Desktop implements Computer
{
    public void compilecode()
    {
        System.out.println("you got thr 10 error & Faaster");
    }
}

class Developer
{
    void Buildapp(Computer  obj)
    {
        System.out.println("Build App");
        obj.compilecode();
    }
}

public class interface_9 
{
    public static void main(String[] args) 
    {
        Developer Dv =new Developer();
        Computer obj = new Desktop();
        // Laptop obj = new Laptop();
        Dv.Buildapp(obj);
    }
}
 