package NumberProblem;

import java.util.Scanner;

//for the given number adding to 1 to it after adding 1 if the number is perfect saquree that number has sunny number 
//means n=3 3+1=4 
//write a java program to find the given number is sunny number or not
public class SunnyNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value :");

		int n = sc.nextInt();	
		int add=n+1;
		boolean flag=true;
		
		for(int i=1;i<=add/2;i++)
		{
			if(i*i==add)
			{
				flag=true;
			}
		}
		
		
		if (flag==true)
		{
			System.out.println("it is Sunny Number");
		}
		else
		{
			System.out.println("it is not a Sunny Number");
		}
	
		
	}	

}
// write java program prime palndrom number or not ex-11,131...S
