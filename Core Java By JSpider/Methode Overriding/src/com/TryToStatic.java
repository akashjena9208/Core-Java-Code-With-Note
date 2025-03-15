package com;
class BMWVehical
{
	void start()
	{
		
		System.out.println("BMW Viheical started");
	}
}


class bmwcar  extends BMWVehical
{
	
	 void start()
	{
		
		System.out.println("BMW Driver Drive the Car");
	}
}


public class TryToStatic 
{
	public static void main(String[] args) {
		bmwcar c=new bmwcar();
		c.start();
	}

}
