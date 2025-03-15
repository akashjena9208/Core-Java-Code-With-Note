package NumberProblem;

import java.util.Scanner;

public class MPowerN 
{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The value m Number");
		int m=scanner.nextInt();
		System.out.println("Enter The value n Number");
		int n=scanner.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*m;
		}
		System.out.println("M poewer n is "+prod);
		
	}

}
