package rtp;

public class mainClassVehicle 
{
	public static void main(String[] args) {
		//1.upcasing using separate reference variable
		Vehicle v1= new car(); //  rule-3
		v1.start();
		Vehicle v2=new bike(); // rule-3
		v2.start();
		//i know that  in upcasting always visibility of parent class property but in this case we will override the child class so visibility are go to child class so runtime cheack which class are run
		
		System.out.println("---------------------");
		
//		int a=10;
//		int a;
//		a=10;
		// Upcasting using single reference variable
		Vehicle v;
		v=new car();
		v.start();
		
		v=new bike();
		v.start();
		
		System.out.println("............................");
		
		Vehicle vehicle;
		vehicle=new car();	//......Car Stated.. this not executed 
		vehicle=new bike();	//.........Bike Started....this is executed  bcz now vehicle reffer bike
		vehicle.start();
		
		
		
		
		
		
		
		
		
	}

}
