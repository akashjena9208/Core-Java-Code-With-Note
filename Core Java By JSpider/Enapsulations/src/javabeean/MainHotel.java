package javabeean;

import java.util.Scanner;

public class MainHotel {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Rating");
		double ratig=sc.nextDouble();
		
		Hotel hotel=new Hotel();
		hotel.setName(name);
		hotel.setRatings(ratig);
		
		String Name=hotel.getName();
		double Rating=hotel.getRatings();
		
		
		System.out.println(Name+" "+Rating);
				
		sc.close();
		
	}
}
