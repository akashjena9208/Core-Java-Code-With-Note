package com;

class Vehicle 
{
	String brand = "Hond";
}

class car extends Vehicle
{
	void drive()
	{
		System.out.println(brand+" Company car I'm Driving");
	}
}

class bike extends Vehicle
{
	void Ride()
	{
		System.out.println(brand+" Company Bike I'm Riding");
	}
}