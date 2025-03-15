package Constructor;

/*Default Constructor:- 
 * object craeat time constractor call as progamer you can't include constractor.
 *  behind the seen automatically java compiler DEfault Constor .
 * - it is zero constractor
 * 
 * -2nd  time  object  craet  you both craet all constructor java .
 * 
 * 
 *Default Constructor
● For every java class constructor concept is applicable.
● If we don't write any constructor, then the compiler will generate a default constructor.
*one/multuple  Constructor
● If we write at least one constructor then the compiler won't generate any default
constructor, so we say every java class will have a compiler generated default
constructor or programmer written constructor but not both simultaneously.
 */

class demo
    {
      private int a;
      private int b; 
      
      public  demo()     // behinde the seen automatically generated the  defult constrictor. but in this case creat constractor bcz you craet  constractor
      {
        System.out.println("zero parameter constractor by programmer");
      }

      public demo(int a,int b)
      {
        this.a=a;
        this.b=b;
      }
      
      void disp()
      {
        System.out.println(a);
        System.out.println(b);
      }
    }

public class constructor_2 
{
    public static void main(String[] args) {
        demo d=new demo();
        d.disp();

        demo d1=new demo(10,20);
        d1.disp();
        
      
    }
}
