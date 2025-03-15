package NumberProblem;

import java.util.Scanner;


public class EachdigitPrint 
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=scanner.nextInt();
		int i = 0;
		while(a!=0)
		{
			i=a%10;
			System.out.println(i);
			a=a/10;
		}
//		System.out.println(a);
		scanner.close();
		
		
	}

}
