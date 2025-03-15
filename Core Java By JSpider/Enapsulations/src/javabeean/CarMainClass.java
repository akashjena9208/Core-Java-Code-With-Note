package javabeean;
public class CarMainClass {
	public static void main(String[] args) {
		Car c=new Car();
		
		c.setCost(756032);
		
		
		int co=c.getprise();
		System.out.println(co);
		//or
		System.out.println("Cosst "+c.getprise());
		
	}
}
