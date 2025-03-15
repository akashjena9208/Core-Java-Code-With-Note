package NumberSystem;

import java.util.Scanner;

public class PrimeNumber 
{
	static boolean isprim(int x)
	{
		if(x==0||x==1)
		{
			return false;
		}
		for(int i=2;i<=x/2;i++)
		{
			if(x%i==0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scanner.nextInt();
		
		boolean a=isprim(n);
		
		if(a==true)
		{
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime");
		}
		scanner.close();
		
	}
}
