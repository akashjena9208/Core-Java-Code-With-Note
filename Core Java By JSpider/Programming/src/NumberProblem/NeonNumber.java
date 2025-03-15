package NumberProblem;


import java.util.Scanner;

public class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scanner.nextInt();		
		int sq=n*n;
		
		int sum=0;
	
		while(sq!=0)
		{
			int digit=sq%10;
				sum=sum+digit;
				sq=sq/10;
		}
		
		if(sum==n)
		{
			System.out.println("neon number "+sq);
		}
		else {
			System.out.println("not a neon nuber "+sq);
		}
		
		scanner.close();
		
	}
}
