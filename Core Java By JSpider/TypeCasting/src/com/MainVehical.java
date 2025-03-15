package com;

public class MainVehical 
{
	
	static void selectVehicle(Vehicle v)
	{
		if(v instanceof car)
		{
			//down cast
			car c= (car) v;
			System.out.println("Brand :- "+c.brand);
			c.drive();
		}
		
		else if (v instanceof bike) {
			bike  b=(bike) v;
			System.out.println("Brand :- "+v.brand);
			b.Ride();
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		selectVehicle(new car());
		System.out.println("-------------");
		selectVehicle(new bike());
	}

}
