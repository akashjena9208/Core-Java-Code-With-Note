package ExceptionHandling;

/* cusomize the Exception name 
 */

 class MyException extends Exception
 {
    // craet constractor
    public MyException()
    {

    }

    public MyException(String msg)
    {
        super(msg); //call parent
    }

 }

public class exe_7
{
    public static void main(String[] args) 
    {
        int num1=6;
        int num2=-2;
        

        try
        {
            if(num2<0)
            {
                  

                Exception obj=new MyException("negative number"); //custome the Exception
                throw obj;
            }
             else
             {
               int res=num1/num2;
               System.out.println(res);
             }
        }

        catch(Exception e)
        {
            System.out.println("plz enter valid number "+e);
        }
    }
}

