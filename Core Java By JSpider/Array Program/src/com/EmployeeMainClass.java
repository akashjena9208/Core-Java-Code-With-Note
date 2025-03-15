package com;
class Employee
{
	int id;
	String name;
	
	Employee(int eid,String ename)
	{
		id=eid;
		name=ename;
		System.out.println("Employee id:- "+id+" Employee name :- "+ename);
	}
	
}
public class EmployeeMainClass 
{
	public static void main(String[] args) {
		
		Employee e1=new Employee(100, "Akash");
//		System.out.println(e1.name +" "+e1.id);
		
		Employee emp[]=new Employee[5];
		
	}

}
