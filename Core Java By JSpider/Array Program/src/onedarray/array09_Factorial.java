package onedarray;

import java.util.Scanner;

public class array09_Factorial {
	
	static int  isFact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*n;
		}
		return fact;
		
	}
	public static void main(String[] args) 
	{

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Size");
			int size=sc.nextInt();
			System.out.println("Enter the Element");
			int[] num=new int[size];

			for(int i=0;i<num.length;i++)
			{
				num[i]=sc.nextInt();
			}

			for(int i=0;i<num.length;i++)
			{
				int res=isFact(num[i]);
				
				System.out.println("Array Element := "+num[i]+"----> "+"Factorial "+res);
			}
		}

	}
}
