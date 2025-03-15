package com;
//Instance Of :----> it is check  the class property present or not if class present return true, not present return  false
public class MaiClass {
		
		public static void main(String[] args) {
			Father father= new Father();
			Son son= new Son();
			Daughter daughter= new Daughter();
			
			//it is check the property of or not that is called instance of  or it is check  the property present or not   			
			//having a property of son 
			//son object having the property of father
			
			
			System.out.println(son instanceof Son);//true
			System.out.println(son instanceof Father);//true
			System.out.println(new Son() instanceof Father);//true
			
			 
			System.out.println(daughter instanceof Daughter);//true
			System.out.println(daughter instanceof Father);//true
			System.out.println(new Daughter() instanceof Father);//true
			
			
			
			System.out.println(father instanceof Father);//true
			System.out.println(father instanceof Son);	//false		
			System.out.println(father instanceof Daughter);//false
			System.out.println(new Father() instanceof Daughter);//false
			
			
		}
}
