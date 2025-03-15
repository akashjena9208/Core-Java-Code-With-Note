package onedarray;

import java.util.Scanner;

public class array07_SumOfOddNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Size");
		int size=sc.nextInt();
		System.out.println("Enter the Element");
		int[] num=new int[size];
		
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==1)
			{
				sum=sum+num[i];
			}
				
		}
		System.out.println(sum);
	}

}
