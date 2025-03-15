package Novmber;
//write java  method overriding by using real World example

class Employee
{
	String name="Akash";
	double sal=49999.9;

	public void disp()
	{
		System.out.println("Employee Name "+name+" Employee sal $"+sal);
	}
	 
	void work()
	{
		
		System.out.println("Employee Working");
	}
	
}


class Devloper extends Employee
{
	@Override
	void  work()
	{
		System.out.println("Devloper Devlop the App!!");
	}
}

class Tester extends Devloper
{
	@Override
	public void disp()
	{
		System.out.println("Employee Name "+name);
	}
	@Override
	void  work()
	{
		System.out.println("Tester  Testing The App!!");
	}
	
}
public class overriding 
{
	public static void main(String[] args) 
	{
		Employee e= new Employee();
		e.disp();
		e.work();
		
		System.out.println("--------Devloper------");
		Devloper  d= new Devloper();
		d.work();
		d.disp();
		
		
		System.out.println("-----------Tester----------------");
		Tester t= new Tester();
		t.disp();
		t.work();
		
		
	}
}
