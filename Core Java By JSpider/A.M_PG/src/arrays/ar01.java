package arrays;

import java.util.Scanner;


public class ar01 
{
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=sc.nextInt();
		int num[]=new int[size];
		System.out.println("Enter the values");
		//to Read data from user and creat an Array
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
		System.out.println("-------Forward Traves----------");
		
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
		
		System.out.println("-------BackWard Traves----------");
		for(int i=num.length-1; i>=0;i--)
		{
			System.out.println(num[i]);
		}
		
		System.out.println("-------------Enhanch---------------------");
		//Enhanch For loop
		for(int n:num)
		{
			System.out.println(n);
		}
		
		sc.close();
			
	}

}
