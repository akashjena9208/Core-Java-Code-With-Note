package operator;

import java.util.Scanner;

public class AndOperator 
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Char");
		char x=sc.next().charAt(0);
		System.out.println("enter a Second Char");
		char y=sc.next().charAt(0);
		
		if (x<y && x==y)
		{
			System.out.println("condition satisfied");
			
		}
		else {
			System.out.println("Condition Declaen");
		}

		

		
		//using ternary operator
		
		System.out.println("Enter the Third Number");
		int a=sc.nextInt();
		System.out.println("enter a Fourth Number");
		int b=sc.nextInt();

		System.out.println(a>b?"a is big":"b is big");

		
		sc.close();
		
	}
}

