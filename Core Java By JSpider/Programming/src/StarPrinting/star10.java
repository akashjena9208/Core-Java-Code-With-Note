package StarPrinting;

import java.util.Scanner;

public class star10 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scanner.nextInt();

		for(int i=1;i<=2*n-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
			
//				if(i+j>=n+1 && i-j<=n-1 )
//				{
//					System.out.print("*"+" ");
//				}
//				else {
//					System.out.print(" "+" ");
//				}
				
			System.out.print(i+j>=n+1 && i-j<=n-1?"*"+" ":" "+" ");
			}
			System.out.println();
		}

	}
}
