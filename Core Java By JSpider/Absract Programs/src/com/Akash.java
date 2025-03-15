package com;
/*Abstract is key word used class & Method  */
// if you Extend  the abstract  class  that have 2 rules
//Rule:-1=	we should make the class as  abstract means child class declare abstract class 
//or
//Rule:-2= override the inherit abstract class  Override the Child method

abstract class PhonePay
{
	abstract void pay();
}



abstract class Flipkart extends PhonePay
{
	abstract void buy();
}



class Akash extends Flipkart {

	
	@Override
	void buy() {
		// TODO Auto-generated method stub
		System.out.println("Akash Buy  New Laptop");
	}

	@Override
	void pay() {
		// TODO Auto-generated method stub
		System.out.println("Payaing $500000 from Phone pay");
	}


	public static void main(String[] args) {

		Akash akash= new Akash();

		akash.buy();
		akash.pay();
	}
}
