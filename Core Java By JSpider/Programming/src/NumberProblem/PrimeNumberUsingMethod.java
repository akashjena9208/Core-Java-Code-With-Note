package NumberProblem;

import java.util.Scanner;

public class PrimeNumberUsingMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		PrimeNumberUsingMethod obj= new PrimeNumberUsingMethod();
		
		boolean flag = obj.findPrime(n);
		
		if(flag)
			System.out.println("It is a prime number");
		else
			System.out.println("It is Not a prime number");
		
		sc.close();
	}
	
	boolean findPrime(int n)
	{
		for(int i=2;i<n;i++)
		{
			if(n%i==0) 
			{
				return false;
			}
		}
		
		return true;
	}
}

// wrire  java program prime number or not 
