package simplearrays;

import java.util.Scanner;

public class arr1 
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the array elemnt");
		double ar[]=new double[5];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scanner.nextDouble();
		}
		System.out.println("----------------------");
		for(int j=0;j<ar.length;j++)
		{
			System.out.println(ar[j]);
		}
		
	}

}
//create double array

