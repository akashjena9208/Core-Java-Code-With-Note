package com;

public class Account {
	long accno;
	double bal;
	String name;
	
	public  int hascode()
	{
		Long l=accno;
		return l.hashCode();
		
	}
	public static void main(String[] args) {
		
	
	}
}
