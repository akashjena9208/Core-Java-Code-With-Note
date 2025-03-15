package rtp;

class Vehicle 
{
	void start()
	{
		System.out.println("Vehicle Started!!");
	}




}

class car extends Vehicle //rule-1
{
	@Override
	void start() //rule-2
	{
		System.out.println("Car Stated");
	}
}



class bike extends Vehicle
{
	@Override
	void start()
	{
		System.out.println("Bike Started");
	}
}


