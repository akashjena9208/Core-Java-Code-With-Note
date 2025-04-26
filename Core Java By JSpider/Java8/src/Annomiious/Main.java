package Annomiious;

public class Main  {
	public static void main(String[] args) {
		
	lambra l	=()-> {
			System.out.println("Hiii");
		};
		
		System.out.println(l);
		
		
		
		
		
		
		//Not Create Oject provide The Implemnation
		MyClass obj=new MyClass() {
			
			@Override
			public void turnOn() {
				System.out.println("Turn On The Ac");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Turn Off The Ac");
				
			}
		};
		
		
		obj.turnOn();
		obj.turnOff();
	}

}
