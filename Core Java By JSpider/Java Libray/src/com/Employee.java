package com;
class Employee {
	int id;
	String name;
	
	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return (" Employee id of -> "+id+" Employee Name :-> "+name);
		
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Akash");
		Employee e2=new Employee(2, "Himanshu");
		
		System.out.println(e1);	//e1.toString
		System.out.println(e2);
	}
}
