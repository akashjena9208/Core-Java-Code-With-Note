package com;
class Vehical
{
	void start()
	{
		
		System.out.println("Viheical started");
	}
}


class car  extends Vehical
{
	@Override
	void start()
	{
		//using super that call to parent class
		super.start();
		System.out.println("Driver Drive the Car");
	}
}


public class VichealCarMainClass {
		
	public static void main(String[] args) 
	{
		
		car c=new car();
		c.start();
	}
}
