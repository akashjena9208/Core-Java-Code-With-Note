package com;

import java.util.Scanner;

public class Soulaton {
	public static void main(String[] args) 
	{
		System.out.println("Welcome To Bank Project");
		System.out.println("........................");
		
		Scanner sc=new Scanner(System.in);
		Bank b=new BankImpl();

		
		while(true)
		{
			//Menu
			System.out.println("1: Depoite");
			System.out.println("2: Withdraw");
			System.out.println("3: Cheack Balance");
			System.out.println("4: Exit");

			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			
			int dep=0;
			int with=0;
			
			if(choice ==1)
			{
				System.out.println("Enter Deposite Amount");
				 dep=sc.nextInt();
				
			}
			else if(choice ==2)
			{
				System.out.println("enter Withdraw Amount");
				 with=sc.nextInt();
			}
			

				
			switch(choice)
			{
			case 1:
				b.deposite(dep);
				System.out.println("Your Money Deposite SucessFull "+dep);
				break;
				
			case 2:
				b.withdraw(with);
				System.out.println("Your Money Withdraw SucessFull "+with);
				break;
				
				
			case 3:
				b.CheackBalence();
				break;
				
			case 4:
				System.out.println("Visit Again!!!");
				System.exit(0);
				break;
				
			default:
				System.out.println("PLZ choisse Valid Input");
				
			}
			System.out.println("..................................");

		}




	}
}
