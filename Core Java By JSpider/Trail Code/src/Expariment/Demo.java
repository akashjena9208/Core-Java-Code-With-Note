package Expariment;
interface Demo1
{
	void add();
}

interface Demo2{
	void add();
}

abstract class demo3 implements Demo1,Demo2
{

	public abstract void add();
	
	void mul()
	{
		System.out.println("Hi");
	}
	
}



public class Demo extends demo3 {


	public void add() {
				int a=10;
				System.out.println(a);
	}

	
}
