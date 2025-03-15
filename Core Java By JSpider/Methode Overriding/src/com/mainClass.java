package com;
//the process of inherit the method and changing the implematation  of the inherit the method is called methodeoveriding
class Father
{
	
	public void bike()
	{
		System.out.println("Old Fahion Father Bike!!");
	}

}

class son extends Father
{
	@Override// annotation Override
	public void bike()
	{
		System.out.println("New Modify Son Bike!!");
	}
}

public class mainClass 
{
	public static void main(String[] args) {
		son s=new son();
		s.bike();
	}
}



