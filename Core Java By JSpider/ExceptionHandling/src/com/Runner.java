package com;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Stared");
		
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("-------------------------------------------");
			e.printStackTrace();
			System.out.println("-------------------OR---------------------------");
			System.out.println(e);
		}
		System.out.println("End");
	}
}
