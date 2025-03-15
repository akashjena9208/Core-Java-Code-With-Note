package NumberProblem;

import java.util.Scanner;

public class PrimeNumberStatic_UsingMethod 
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=scanner.nextInt();
		//calling another methode
		boolean res=isPrime(n);
		if(res==true)
		{
			System.out.println("It is The Prime");	
		}
		else
		{
			System.out.println("it is Not prime");
		}
	}
	
	public static boolean isPrime(int n)
	{
		
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;	
		
	
	}


}

