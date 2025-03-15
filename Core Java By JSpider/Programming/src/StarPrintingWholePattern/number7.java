package StarPrintingWholePattern;

import java.util.Scanner;

public class number7 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=2*n-1;j++)
			{
				if(i==j || i==1  || i==2*n-1 ||i+j==n*2)
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
