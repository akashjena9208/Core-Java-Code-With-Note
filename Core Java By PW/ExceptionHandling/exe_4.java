package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Try With Resorces Without finally key word used :- write try parameter then run , not add the finally key word
 */


public class exe_4
{
  public static void main(String[] args) 
  {
    int num=0;
    try(Scanner sc = new Scanner(System.in))       /*resorce creat & closed with out write finally keyword write try parameter */    
    {
        System.out.println("Enter a input");   
        num=sc.nextInt();  
    }
    catch(InputMismatchException e)
    {
        System.out.println("somthing went to wrong"+e);
    }

    System.out.println("Your input "+num);
  }  
}
