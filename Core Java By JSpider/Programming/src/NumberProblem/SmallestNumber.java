package NumberProblem;

import java.util.Scanner;

public class SmallestNumber 
{
	public static void main(String[] args) 
	
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number");
		int d=scanner.nextInt();
		int smallest=10;
		int digit=0;
		
		while(d!=0)
		{
			 digit=d%10;
				if(digit<smallest)
				{
					digit=smallest;
					d=d/10;
				}
								
		}
		System.out.println(digit);
		
		scanner.close();
	}
	


}
