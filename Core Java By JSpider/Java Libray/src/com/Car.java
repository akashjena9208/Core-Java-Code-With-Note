package com;
class Car {
	public String toString()
	{
		return "Car@100";
	}
	public static void main(String[] args) {
		Car c= new Car();
		System.out.println(c); 	//s.toString();
	}

}
//String represantation of an object
//FullyQualifiedClassName@HexadecimalOfHascode
//HasCode is unique code
//packagename.classname@hexdecimalValueOfHascode	ex:-com.Car@2c7b84de ...it is adress
//object is class 