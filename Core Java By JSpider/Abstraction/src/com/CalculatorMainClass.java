package com;

import java.util.Scanner;

public class CalculatorMainClass 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Calculator c =new  CalculatorImplementation(); //rule 4

		System.out.println("enter the number");
		int a =sc.nextInt();
		System.out.println("enter the number");
		int b =sc.nextInt();

		c.add(a, b);
		c.mul(a, b);
		
		sc.close();


	}

}
