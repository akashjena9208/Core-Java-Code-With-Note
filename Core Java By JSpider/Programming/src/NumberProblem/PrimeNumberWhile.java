package NumberProblem;
import java.util.Scanner;

public class PrimeNumberWhile 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		boolean flag=true;
		int i=2;
		
		while(i<n)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
			i++;
		}
		
		if(flag)
			System.out.println("It is a prime number");
		else
			System.out.println("It is Not a prime number");
		
		sc.close();
	}

}
