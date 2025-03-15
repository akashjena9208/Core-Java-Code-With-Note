package javabeean;

import java.util.Scanner;

public class EmployeeMainClass {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enther the Id");
			int eid=sc.nextInt();
			
			System.out.println("Enter The Name");
			String sname=sc.next();
		
		Employee e=  new Employee();
		//calling set method
		e.setId(eid);
		e.setName(sname);
		
		//calling get method & Fetch The Data
		int  id= e.getId();
		String name=e.getName();
		System.out.println("Employee Id :- "+id+"  "+"Employee name is :- "+name);
		sc.close();
	}
}
