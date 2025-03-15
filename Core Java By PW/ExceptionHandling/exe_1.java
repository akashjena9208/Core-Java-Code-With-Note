package ExceptionHandling;

public class exe_1 
{
    
    public static void main(String[] args)
    {
        //normal
        int num1=6;
        int num2=2; // int num2=0;
        int res=0;
        
        try  // try block used  handel the exception
        {
            //critical
           res= num1/num2;
           System.out.println("Any Exception Dirctly Jump Catche");
        }
                //object creat
        catch(Exception A) // catche block used and call th
        {
            System.out.println("Somthing went to Wrong"+A);
        }

        System.out.println(res);
        System.out.println("Execption Handel");
        
    }
}
