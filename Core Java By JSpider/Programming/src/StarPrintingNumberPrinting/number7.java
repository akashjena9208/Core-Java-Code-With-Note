package StarPrintingNumberPrinting;

import java.util.Scanner;

public class number7 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Programme");
		int n=sc.nextInt();


		for(int i=1;i<=n;i++)
		{
			int a=1;
			for (int j=1;j<=n;j++) 
				{

					if(i+j>=n+1)
					{
						System.out.print(a);
						a++;
					}
						else
						{
							System.out.print(" ");
						}
				}
			System.out.println();
		}
		sc.close();
	}
}
