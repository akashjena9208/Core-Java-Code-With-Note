package com;
public class Solution {
	// you pass the value that type you fatch the value that type
//	static void display(int x)
//	{
//		
//	}
//	public static void main(String[] args) 
//	{
//		display(10);
//		
//	}
	
//ex-2 you pass the value that type you fatch the value that type
	
//	static void display(String x)
//	{
//		
//	}
//	public static void main(String[] args) 
//	{
//		display("Hi");
//		
//	}
	
	
//........................................................................................................

	
//	static void displays(Son son)
//	{
//		
//	}
//	
//	public static void main(String[] args) {
//	//you can not create object bcz of same class and static type
//		//i pass the child_object and   refrence variable store child Class
//		display(new Son());
//	}
	
	
	

//	static void display(Father father)
//	{
//		
//	}
//	
//	public static void main(String[] args) {
//	//you can not  need of create object bcz of same class and static type
//		//i pass the child_object, and reference variable  store it ,Parent Class  referring
//		display(new Son());
//	}
	
	
	// i pass the  display(new Son()) child_object,
	//obj  reference variable store the child_object

	
	
	//..................	//Generalization  or Upcasting..............................................................................
			//1.Display(new son()); :-> Father obj =new Son();
			//2.Display(new daughter()); :-> Father obj =new Daughter();
	
	
	static void display(Father obj)	//Father obj:----> create  parent object Refrence_varibale  
	{
		if (obj instanceof Son)
		{
			System.out.println("Down Cast The Son!!");
			Son s=(Son) obj;//down cast
//			System.out.println(obj.x+" "+obj.y);//error y:--------bcz  parent  object class reference we only access parent property not child property 
			System.out.println(s.x+" "+s.y);	//two property are available Son class that is  x,y
//			System.out.println(s.z); //error z :------we can not call other child class property	
		}
		else if (obj instanceof Daughter) {
			System.out.println("Down Cast The Daugher!!");
			Daughter d= (Daughter) obj;	//downcasting 
			System.out.println(d.x+" "+d.z);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		display(new Son());
		System.out.println(".....................");
		display(new Daughter());
		
		
	}
	

	
//creat class employee,  intlized 	the value 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
