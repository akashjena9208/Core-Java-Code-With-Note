package com;

public class Subha  extends Swiggey{

	@Override
	void foodOrder() {
		// TODO Auto-generated method stub
		System.out.println("ordering Food from Swiggy app!!");
	}

	@Override
	void payAmpout() {
		// TODO Auto-generated method stub
		System.out.println("Paying 2000 using paytm app");
		
	}
	
	public static void main(String[] args) {
		Subha subha=new Subha();
		subha.foodOrder();
		subha.payAmpout();
	}

}
