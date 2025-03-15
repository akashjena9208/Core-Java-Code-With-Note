package com;
class Father
{
		public Father() {
			System.out.println(1);
		}
}
public class Son extends Father 
{
	Son(){
		//super() .................Used Implicitly or By default
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		Son son=new Son();
	}
}
