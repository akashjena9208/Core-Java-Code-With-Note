package rtp;

class Employee
{
	
	void work() {
		System.out.println("Employeee Working");
	}
}

class Devloper extends Employee
{
	@Override
	void work()
	{
		System.out.println("Devlopping the App!!!");
	}
}

class Testeter extends Employee
{
	@Override 
	void work()
	{
		System.out.println("Testing the App!!");
	}
}

// Upcasting Super class reference store sub class object
// Upcasting archive 3 way;-

public class EmplyoyeeDevloperTester 
{
	
	
	static void disp(Employee obj) 
	{
		obj.work();
	}
	
	
	public static void main(String[] args) 
	{
		// Upcasting using Methode
			System.out.println("........................Upcasting Using Methode........................");
			//same class you dirctly call or class name call
			EmplyoyeeDevloperTester.disp(new Devloper());	
			disp(new Testeter());
			
			
			System.out.println("------------Upcasting Using Seperated Refrence Varibale-----------------");
			
			
			Employee ed=new Devloper();
			ed.work();
			
			Employee et=new Testeter();
			et.work();
			
			
			System.out.println("------------ Upcasting Using Single Refrence Varibale--------------------");	
			Employee e;
			e=new Devloper();
			e.work();
			e=new Testeter();
			e.work();
			
			
			
			
	}

}
