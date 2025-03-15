package NumberProblem;
//write java program  to find the prime number or not  with in given range; 
import java.util.Scanner;

public class PrimeNumberStatic_UsingMethod_beetwen_range 
{
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
	
	
	public static void main(String[] args) 
		{
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=scanner.nextInt();
		//calling another methode
		for(int i=1;i<=n;i++) 
		{
			boolean res=isPrime(n);
			if(res==true)
				{
				System.out.println(i);	
				}
			else
			{
				System.out.println("it is non prime so range");
				break;
			}
		
		}
		
		scanner.close();
	}
}

//wjp to reverse of the given number
