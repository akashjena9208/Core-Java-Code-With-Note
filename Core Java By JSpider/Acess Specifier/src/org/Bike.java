package org;

import com.vehicle;

public class Bike extends vehicle
{
	public static void main(String[] args) {
		Bike b=  new Bike();
		System.out.println(b.brand);
		b.start();
	}
}
