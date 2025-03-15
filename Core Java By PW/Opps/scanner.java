package Opps;
/*
 * Scanner :-Take  user inputing java. consel to input a  java  program
 * 1st scaner inbuild package create
 * 2nd object creat and enable to console (System.in)
 * 3rd scaning  and store a varibale 
 *
 * 
 * 
 * 
 */

 import java.util.Scanner;
 public class scanner {
     public static void main(String[] args) {
         Scanner Scan=new Scanner(System.in);

         System.out.println("Enter the name");    // String nmae:-  Line
         String name=Scan.nextLine();
         System.out.println("My name is "+name);

         System.out.println("Enter the age");     //whole number:-  int
         int age =Scan.nextInt();
         System.out.println("Age is "+age);

         
        System.out.println("Enter your Average  mark"); //Real number:- dobule
        double avg=Scan.nextDouble();
        System.out.println("my  carrier average mark"+avg);
 
     }
     
 }
