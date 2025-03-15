package com;

class StudentForString 
{
	int age;	
	StudentForString(int age)
	{
		this.age=age;
	}
	
	public String toString()
	{
		return	"Age is: "+ age; //String+String=String
		
		
	}
	
	public static void main(String[] args) {
		StudentForString s= new StudentForString(20);
		System.out.println(s); //s.toString
	}

}
