package NumberProblem;

import java.util.Scanner;

public class PrimePalindrom 
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number");
		int prime=scanner.nextInt();
		//palindrom Number
		int temp=prime;
		int reverse =0;
		//prime 
		boolean flag=true;
		//PrimeNumber Or not
		for(int i=2;i<prime/2;i++)
		{

			if(prime%i==0)
			{
				flag=false;
				break;
			}
		}
	//palindror or not cheack
		while(prime!=0)
		{
			int digit = prime%10;
			reverse=reverse*10+digit;		
			prime = prime/10;
		}
		
		
	if(flag==true && reverse==temp)
//		if(reverse==temp)
		{
			System.out.println("it is a PrimePalindrom  Number");
		}
		else 
		{
			System.out.println("it is a Not PrimePalindrom Number");
		}
		scanner.close();
	}
}
//write java program to find the given Xylem/Phloem
