package onedarray;

import java.util.Scanner;

public class array05_oddNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
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
			if(num[i]%2==0)
				System.out.println(num[i]);
		}
	}

}
