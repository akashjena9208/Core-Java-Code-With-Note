package com;
interface A
{
	int x=10;
	
	void eat();
}

interface B
{
	int x=20;
	void eat();
}

public class C  implements A,B{
	@Override
	public void eat() {
		
		System.out.println("Biryani");
	}
	public static void main(String[] args) {
	
		C c=new C();
		c.eat();
		
		
	}
	
	
	
		
}
