package com;

//Accessing public Member inside Same class
public class Student 
{
	public static int age=22;
	public static String name="Akash";


	public void study()
	{
		System.out.println("Study in Java!!");
	}



	public static void main(String[] args) 
	{
		//Access with class name because of static
		System.out.println("Age "+Student.age);
		System.out.println("name "+Student.name);

		// Assesses a object create because of on static
		Student student= new Student();
		student.study();
	}
}
