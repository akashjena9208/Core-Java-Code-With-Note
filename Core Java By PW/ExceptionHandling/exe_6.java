package ExceptionHandling;

/* throw key word used a creat Exception, &  call the catch block  creat exception so used throw key word, 
 * throw & throws  are different
 */

public class exe_6 
{
    public static void main(String[] args) 
    {
        int num1=6;
        int num2=-2; // when you  -ve value don't know
        int res=0;

        try
        {
            if(num2<0)
            {
                   // System.out.println("plz enter valid number");     // repet  2 times

                Exception obj=new Exception();
                throw obj; 
                //call the catch block  creat exception so used throw key word, 
                //throw ke liye kon sa type ka object hai batna podaga so craet a object
            }
             else
             {
                res=num1/num2;
             }
        }

        catch(Exception e)
        {
            System.out.println("plz enter valid number "+e);
        }

        System.out.println(res);

    }
}

