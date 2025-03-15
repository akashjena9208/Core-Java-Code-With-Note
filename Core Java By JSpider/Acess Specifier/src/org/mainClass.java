package org;



import com.Car;

//Accessing public Members in different package
public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//
		System.out.println(Car.brand);
		
		Car c=new Car();
		System.out.println(c.cost);

	}

}
