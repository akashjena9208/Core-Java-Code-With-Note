package MultiTheding;
/*
 * What is Thread -Line of Execution 
 * one Thread 
 * Three Task are  different Difeernt  all  are indepndent task not depend to other
 * one Acivity Run then another Activity  bcz it is a One Thread
 * due one Thread Cpu time Cycleing west  
 */

import java.util.Scanner;

public class mul_1 
{
    public static void main(String[] args) 
    {
        System.out.println("calculation Started");
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your First Name");  //.............................................................Task-1
        String st=Sc.nextLine();
        System.out.println("Your First Name is "+st);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Scanner Sc1 = new Scanner(System.in);
        System.out.println("Enter your last Name");
        String st1=Sc1.nextLine();
        System.out.println("Your Last Name is "+st1);  //.............................................................Task-2

        System.out.println("your Name is "+st+st1);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        for(int i=0;i<5;i++)
        {
            System.out.println("*");  //.............................................................Task-3
        }
        

    }
}
