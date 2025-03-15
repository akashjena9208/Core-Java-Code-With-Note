package NumberProblem;

import java.util.Scanner;

// if the given number and revrese of number are same then they are called palimdrom number
//
public class Palindrome 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value :");

		int n = sc.nextInt();
		int temp=n;

		int reverse =0;

		while(n!=0)
		{
			int digit = n%10;
			reverse=reverse*10+digit;		
			n = n/10;
		}
		if(reverse==temp)
		{
			System.out.println("it is Palindrome");
		}
		else
		{
			System.out.println("it is not Palindrome");
		}
		
		sc.close();
	}
}

// write java program diveser of given
