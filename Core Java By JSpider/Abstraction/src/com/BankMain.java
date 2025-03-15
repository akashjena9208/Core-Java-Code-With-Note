package com;

import java.util.Scanner;

public class BankMain 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Bank b= new BankImp();

		b.CheackBalence();
		System.out.println("--------------");

		System.out.println("Enter the Deposite Money");
		int Deposite=sc.nextInt();

		b.deposite(Deposite);
		b.CheackBalence();
		System.out.println("--------------");

		System.out.println("Enter the Witdraw  Money");
		int Witdraw=sc.nextInt();	

		b.withdraw(Witdraw);
		b.CheackBalence();
		System.out.println("--------------");



		sc.close();	
	}

}
