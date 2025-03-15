package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Cheak Exception:-compile time Error,Compiler compile time force  Handel the exception. 
 * UnCheak Exception:- Compiler not force if yor choise mens Compiler not cheack ,Run time cheak
 */


public class exe_8 
{
    public static void main(String[] args) 
    {
        int Result= 7/0; // uncheak exception comiple run then this time error

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // beforescanner class
        try
        {
        String str=br.readLine();// error bcz cheak a  compile time
        }
        catch(IOException e) 
        {
            e.printStackTrace();
        }

        

    }
}
