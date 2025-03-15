package NumberProblem;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int FN=scanner.nextInt();
		int prod=1;
		
		
		for(int i=1;i<=FN;i++)
		{
			prod=prod*i;
			
		}
		System.out.println(prod+" Factorial of the Number");
		
		scanner.close();
	}
}
//write java program to the given number is strong or not
//the sum so factorial of each digith in a number is =  the gin=ven numbr is 