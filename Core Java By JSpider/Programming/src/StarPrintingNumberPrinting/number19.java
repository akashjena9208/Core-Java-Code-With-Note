package StarPrintingNumberPrinting;

import java.util.Scanner;

public class number19 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Programme");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int a=n;
			for (int j=1;j<=2*n-1;j++) 
			{

				if(i<=j && i+j<=2*n)
				{
					System.out.print(a+" ");
					if(j< n)
					{			
						a--;
					}
					else
					{			
						a++;
					}
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
