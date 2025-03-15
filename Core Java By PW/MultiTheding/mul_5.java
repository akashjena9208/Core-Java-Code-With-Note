package MultiTheding;

import java.util.Scanner;

/*. By implements Runnable */

// Task1 Task2 are dealy cpu time cycyle not west  
class MultiThreading1 implements Runnable
{
    public void run()
    {
        System.out.println("Calculation strated ");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=sc.nextInt();

        System.out.println("Enter 2nd number");
        int num2=sc.nextInt();

        int res= num1+num2;
        System.out.println(res);

        System.out.println("calcution End");


        System.out.println("....................................."); //.......................................................................Task 1

    }
}
class multiple1 implements Runnable
{
    public void run()
    {
        
        System.out.println("Display the import mesaage ");
        for(int i=0;i<5;i++)
        {
            System.out.println("*");  //...............................................................................................Task-2
        }
        System.out.println("display the las mesage");
    }
}
public class mul_5 
{
    public static void main(String[] args) 
    {
        System.out.println("Main thread Strated");
        MultiThreading1 obj =new MultiThreading1();
        multiple1 ob2= new multiple1();

        Thread t=new Thread(obj);
        Thread t2= new Thread(ob2);
    
        t.start();
        t2.start();

    }
} 