package com;



public class CalculatorImpl  implements Calculator{

	@Override
	public void add(int x, int y) {
		int res=x+y;
		System.out.println("Sum of Number "+x+" + "+y+" "+res);

	}

	@Override
	public void sub(int x, int y) {

		int res=x-y;
		System.out.println("Diffrence of Number "+x+" - "+y+" "+res);
	}

	@Override
	public void mul(int x, int y) {
		int res=x*y;
		System.out.println("Product of Number "+x+" *  "+y+" "+res);
	}

	@Override
	public void div(int x, int y) {
		int res=x/y;
		System.out.println("Divisio   Number "+x+" / "+y+" "+res);	
	}

}
