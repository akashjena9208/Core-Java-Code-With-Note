package com;

//Accessing public member in different class,same class
public class EmployeeMainClass 
{
	public static void main(String[] args) 
	{
		Employee emp =new Employee();
		System.out.println(emp.id+" This is a  Employee id");
		System.out.println(emp.name+" This is a Emp name ");
		
		//static
		Employee.work();
		
	}

}
