package StarPrintingWholePattern;

import java.util.Scanner;

public class number2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(i==1 ||i==2*n-1||j==1 || j==2*n||i==j ||i+j==2*n)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}
}
