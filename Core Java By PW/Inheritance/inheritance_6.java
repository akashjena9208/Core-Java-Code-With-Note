
package Inheritance;
class Boy
{
    public void pro()
    {
        System.out.println("it is a Herichical ");
    }
}

class studentt extends Boy
{

}

class Bro extends  Boy
{

}



public class inheritance_6
{
    public static void main(String[] args)
    {
         Bro b=new Bro();

         b.pro();
         
    }
}
