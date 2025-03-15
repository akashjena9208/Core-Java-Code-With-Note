package com;
class A

{
	public  int add(int x,int y)
	{
		return x-y;
	}
	
}

class B extends A	//alaredy ovverride that reason  after upcastig + are call
{
	public   int add(int x,int y)
	{
		return x+y;
	}
    // public   int sub(int x,int y)
	// {
	// 	return x*y;
	// }
}
public class User 
{

	public static void main(String[] args) {

		B b=new B();
		System.out.println(b.add(10, 20));
        // System.out.println(b.sub(10,20));
		
		A b1=b;	//Upcasting  //  call parent class but parent class already ovevride that reason  child cls methode call
		
		System.out.println(b1.add(10, 20));
        // System.out.println(b1.sub(10, 20));

        
	}

}
