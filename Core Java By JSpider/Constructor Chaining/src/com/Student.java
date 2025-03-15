package com;
//Constructor overloading is process of mulitipule consuctor has same name but their pramametar are different
public class Student 
{
	 Student(int age) {	//age:22
		 System.out.println("Age "+age);
		
	}
	
	 Student(String name) { //name:tom
		 this(22);
		 System.out.println("Name "+name);
	}
	
	Student(double height)	//height 5.7
	{
		this("Tom");
		System.out.println("height "+height);
	}

	public static void main(String[] args) {
		new Student(5.7);
	}
}
