package com;

abstract class  person
{
	abstract void eat();
}


// Rule 2:-override the inherit abstract class means either  @Override the method 
//abstract that is override example
class Tom extends person {

	@Override
	void eat() {
		System.out.println("Tom is eating");
	}


	public static void main(String[] args) {
		Tom tom= new Tom();
		tom.eat();
	}

	

}
