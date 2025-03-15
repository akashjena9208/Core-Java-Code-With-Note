package ctp;
//Overloading Non Static     
//Compile time polymophirsm //both overloading  static() & non static(method) 
// static binding //methode overloading time  implentition and not change
//complie time cheack
public class Student 
{
	void  display(int age)
	{
		System.out.println("Age: "+age);
	}
	
	void display(String name)
	{
		System.out.println("Name: "+name);
	}
	
	void display(int age,String name)
	{
		System.out.println("Age "+age+" "+"Name "+name);
	}
	
	
	void display(String name,int age) {
		System.out.println("Name "+name+" "+"Age "+age);
	}

}
