package NumberProblem;
import java.util.Scanner;
public class SpyNumber 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value :");
		
		int n = sc.nextInt();
		
		int sum =0;
		int prod=1;
		
		while(n!=0)
		{
			int digit = n%10;
			sum=sum+digit;
			prod=prod*digit;
			n = n/10;
		}
		
		if(sum==prod)
		{
			System.out.println("It is a spy number");
		}
		else
		{
			System.out.println("It is not a spy number");
		}
		
		sc.close();
	}


}
