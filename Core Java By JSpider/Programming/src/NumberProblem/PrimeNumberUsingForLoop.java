package NumberProblem;

import java.util.Scanner;

public class PrimeNumberUsingForLoop 
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number");
		int prime=scanner.nextInt();


		boolean flag=true;

		for(int i=2;i<prime;i++)
		{

			if(prime%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true) 
		{
			System.out.println("it is a prime Number");
		}
		else 
		{
			System.out.println("it is a Not prime Number");
		}
		scanner.close();
	}

}
