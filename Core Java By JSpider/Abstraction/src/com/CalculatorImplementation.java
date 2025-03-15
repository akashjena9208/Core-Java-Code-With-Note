package com;

//eithere class absract or overide
//interface is relationship so implements
class CalculatorImplementation implements Calculator {	//rule -2

	@Override
	public void add(int x, int y)
	{
		System.out.println("Sum Of "+x+" & "+y+" is "+(x+y));
	}


	@Override
	public void mul(int x,int y)
	{
		int  product =x*y;
		System.out.println("Product of "+x+" & "+y+" is "+product);
	}
}
