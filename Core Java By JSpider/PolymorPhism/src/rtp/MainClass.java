package rtp;

public class MainClass 
{
	
	//1.decideVehicle(new Car());--->Vehicle obj = new car() --->obj.start();
	//2.decideVehicle(new bike());--->Vehicle obj = new bike() --->obj.start();
	static void decideVehicle(Vehicle obj)
	{
		System.out.println("-----------------USing method----------------------------");
		obj.start();
	}
	public static void main(String[] args) {
		//1. Upcasting USing method
		decideVehicle(new car());//rule3
		decideVehicle(new bike());//rule-3
		
		System.out.println("----------Separate reference Variable---------------");
		
		//2.Upcasting Using Separate reference Variable
		Vehicle v1=new car();	//rule-3
		v1.start();
		
		Vehicle v2= new bike(); //rule-3
		v2.start();
		
		System.out.println("-----------Single reference Variable-----------------");
		// Upcasting Using Single reference Variable
		Vehicle v;
		v=new car();
		v.start();
		v=new bike();
		v.start();
		
		
		
	}

}
