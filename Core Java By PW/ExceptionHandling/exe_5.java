package ExceptionHandling;

/*Handling vs Ducking:-  you don't handel the exception used throw Exception

main also  throw Exception but we don't write bcz of jvm is a inbluilt methode

handel:-try,catch
Ducking:- throws Exception
        -means not handle the exception , those methode  have call he is not handel so  retrun the throw exception

  why used :- let support 2 methode eroor main methode handel both the exception
 * 
 */
class demo
{
   public void a() throws Exception
   {
      b();
   }

   public void b() throws Exception
   {
    int num1 =15;
    int num2 =0 ;
    // int res=0;

    int res=num1/num2;
    
    System.out.println(res);

// try {
//      res=num1/num2;
//     }
//     catch(ArithmeticException e)
//     {
//       System.out.println("Error"+e.getMessage());
//     }
//     System.out.println(res);
  }
}
public class exe_5
{
  public static void main(String[] args) 
  {
    demo  obj = new demo ();
    try
    {
     
     obj.a();
    }
    catch(Exception e)
    {
      System.out.println("Error of Arethmetic "+ e.getMessage());
    }

  }  
}

