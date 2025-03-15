package com;

public class Pen {
	public static void main(String[] args) {
		Pen p=new Pen();
		System.out.println(p);
		System.out.println(p.hashCode());//hascode value represant
		System.out.println("---------------------");
		int hc=p.hashCode();
		System.out.println(hc);
		System.out.printf("%x",hc);	//convot hexadecimal value
		System.out.println("---------------------");
		
		//--------------------------------------------------------------------------------------------------------
		
		
	}
}
