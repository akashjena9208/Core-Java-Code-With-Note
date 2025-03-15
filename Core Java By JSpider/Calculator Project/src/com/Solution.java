package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("Welcome to Calculate Project");
		System.out.println("-----------------------------");
		Scanner sc= new Scanner(System.in);
		Calculator c=new CalculatorImpl();	//upcasting for abstraction



		while(true)	
		{

			//Menu Driven program
			System.out.println("1:Addition");
			System.out.println("2:Subtraction");
			System.out.println("3:Multiplication");
			System.out.println("4.Divison");
			System.out.println("5.Exit");

			System.out.println("Enter The Chosee");
			int choice=sc.nextInt();
			/**
			 * local variables does not have default values
			 * therefore intalizing it to  explicitly
			 * declaring x & y outside if block, because to increase visibility
			 */
			int a=0;
			int b=0;
			// Accepting  2 numbers when choice is	1,2,3,4


			if(choice>=1 && choice<=4)
			{
				System.out.println("Enter 2 Value");
				a=sc.nextInt();
				b=sc.nextInt();
			}


			switch(choice)
			{
			case 1:c.add(a,b);
			break;
			case 2:c.sub(a, b);
			break;
			case 3:c.mul(a, b);
			break;
			case 4:c.div(a, b);
			break;
			case 5:
				System.out.println("Thank You !!! You Exit  The Project");
				System.exit(0);
			default: System.out.println("Invalid number");
			}
			
			System.out.println("---------------------------------------------------------");


		}
	}
}

