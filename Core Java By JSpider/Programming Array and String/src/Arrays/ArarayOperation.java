package Arrays;

import java.util.Scanner;

public class ArarayOperation {

	//to read data from user and creat an array
	public static int[] readarraya()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size=sc.nextInt();

		int ar[]=new int[size];
		
		System.out.println("Enter The Element");
		
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		return ar;
	}
	
	//to display the data presant the in an array
	public static void display(int ar[])
	{
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[j]+" ");
		}
	}
}


// to write java  program to remove elemnt with out using new array
