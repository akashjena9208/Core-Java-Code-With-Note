package com;
class Vehical 
{
	Vehical(String brand)
	{
		System.out.println("In Vehical");
	}
}
public class Bike  extends Vehical
{
	Bike()
	{
		super("Honda");	//Explicit
		System.out.println("In Bike");
		
	}
	public static void main(String[] args) {
		new Bike();
	}
	
}
