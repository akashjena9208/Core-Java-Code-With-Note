package com;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Real Time Example of Run time exception In to string you override the methode
public class Sol {
	static void run() throws FileNotFoundException
	{
		FileReader f=new FileReader("t.text");
	}
	
	static void exe() throws ArithmeticException
	{
		//Exception is a Class So creat a Object
		Exception ef= new ArithmeticException();

	}
	
	
	public static void main(String[] args) {
		System.out.println("Strat");
		try {
			run();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		exe();
		
		
	}
}
