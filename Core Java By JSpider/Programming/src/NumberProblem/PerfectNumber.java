package NumberProblem;

import java.util.Scanner;

//write java program find the given number is perfect number or not
//if the sum of divisor of a number execept the number it selef equl to the give number such number are called perfrct number
public class PerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value :");

		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
//				System.out.println(i);
			}
		}
		
		
		if (sum==n)
		{
			System.out.println("it is a perfect Number");
		}
		else
		{
			System.out.println("it is a not  perfect Number");
		}
		sc.close();

	}

}
