package StarPrintingNumberPrintingDimond;

import java.util.Scanner;

public class number4 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Programme");
		int n=sc.nextInt();


		for(int i=1;i<=2*n-1;i++)
		{
			int a=5;
			for (int j=1;j<=2*n;j++) 
				{

					if(i+j >=n+1 && i-j<=n-1 && i+j<=3*n-1 && j-i<=n-1)
					{
						if(j<n)
						{
							System.out.print(a--+" ");
						}
						else
						{
							System.out.print(a+++" ");
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
