
package com;

//abstract class Tom implements employee  {
//		//Rule 1
//}

class Tom implements employee
{

	@Override
	 public void work() 
	 //if i don't write public give the error bcz we Cannot reduce the visibility of the inherited method from employee
	 //Acess Spicifer always same or highVisbulity
	{
		// TODO Auto-generated method stub
		System.out.println("Tom Is Working");		
	}
	
	public static void main(String[] args) {
		System.out.println("Without Object creat we call Static method  id: "+employee.id);
		
		Tom tom=new Tom();
		tom.work();
	}
	
}
