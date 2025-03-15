package com;

//...............................Parent Class.............................................................
class Employee
{
	int id=201289215;
}


//......................................Child class........................................................

class Devloper extends Employee
{
	void devlop()
	{
		System.out.println("Devloppping app");
	}
}


class Tester  extends Employee
{
	void test()
	{
		System.out.println("Testting The App!!");
	}
}


public class MainEmployee 
{
	// if i create a child object only access child object is called sepelijation  if both acces so create parent object that is called  
	static void solution(Employee objcetEmployee)	
	{

		if(objcetEmployee instanceof Devloper)
		{
			System.out.println("Down Cast");
			Devloper devloper=(Devloper) objcetEmployee;
			System.out.println(devloper.id);
			devloper.devlop();
		}
		else if (objcetEmployee instanceof Tester) 
		{
			System.out.println("Down cast");
			Tester tester= (Tester) objcetEmployee;
			System.out.println(tester.id);
			tester.test();
		} 

	}


	public static void main(String[] args) 
	{
		solution(new Devloper());
		System.out.println(".......");
		solution(new Tester());

	}


}
