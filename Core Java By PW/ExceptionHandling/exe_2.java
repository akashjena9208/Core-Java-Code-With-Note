package ExceptionHandling;

/*Try multipuel Catch:- Try block have a multipule critical Section
                            one try class multipue catche.
 */

public class exe_2 
{
   public static void main(String[] args) 
   {
    int a =6;
    int b = 3;
    int res =0;
    int arr[]={2,4,6,8};
    String name=null;

    try
    {
        //res=a/b;
        System.out.println(arr[0]); //error
        res= a/name.length(); //error // null point exception
       
    }

    catch(ArithmeticException e)
    {
        System.out.println("can not devid by  zero"+e);
    }

    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(arr[arr.length-1]);
        System.out.println("Stay your limit");
        
    }

    catch(Exception e)
    {
        System.out.println("somthing went to wrong "+e);
    }

    System.out.println(res);
    System.out.println();

   }
 }


