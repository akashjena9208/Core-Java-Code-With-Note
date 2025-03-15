package operator;

import java.util.Scanner;

public class turnary {
	
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a=scanner.nextInt();
		System.out.println("enter a Second Number");
		int b=scanner.nextInt();

		if (a==b && a>=b)
		{
			System.out.println("condition satisfied");
		}
		else {
			System.out.println("Condition Declaen");
		}


		scanner.close();
	}
}

