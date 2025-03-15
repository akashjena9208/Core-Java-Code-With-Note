package com;

public class Travel {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		
		System.out.println("........................For-Ward Travel ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Index of  Value:-  "+i+" " +"Array Value :- "+a[i]);
		}
		
		System.out.println("length of array "+a.length);
		
		System.out.println("......................Back-Ward Travel................................... ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println("Index of  Value:-  "+i+" " +"Array Value :- "+a[i]);
		}
	}
}
