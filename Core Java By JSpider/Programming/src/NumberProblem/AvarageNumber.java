package NumberProblem;

import java.util.Scanner;

public class AvarageNumber 
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number");
		int a=scanner.nextInt();
		int sum=0;
		int count=0;	
		while(a!=0)
		{		
			int digit=a%10;
			count++;
			sum=sum+digit;
			a=a/10;		
		}
		System.out.println("Sum of number "+sum);
		System.out.println("Count of number "+count);
		System.out.println("Avg number "+(sum/count));
		
		scanner.close();
	}
	

}
