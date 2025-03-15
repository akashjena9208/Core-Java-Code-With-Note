package ListCol;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListAllMethods {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList();
		List<String> ll=new LinkedList();
		List<String> vc=new Vector();
		List<String> stack=new Stack<String>();
		
		
		al.add(10);
		al.add(0);
		al.add(null);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(50);
		al.add(30);
		al.add(null);
		al.add(100);
		al.add(140);
		
		System.out.println(al);
		
		System.out.println(".....get :- return the object based on index"+al.get(5));
		//set(index,value) add index spicfic index and exting index dlt or lost
		al.set(1, null);
		System.out.println(al);
		//it is returen the index position if your value is dupicate 1st elemnt index poition
		System.out.println(".....returen the index position:- "+al.indexOf(null));
		//Find the last index
		int i=al.lastIndexOf(null);
		System.out.println("Find the last index "+i);
		
		al.add(1,5000);
		System.out.println();
		
//		al.add(1000);
//		al.add(770);
//		al.add(null);
//		al.add(550);
//		al.add(605);
//		al.add(740);
//		al.add(550);
//		al.add(350);
//		al.add(null);
//		al.add(1050);
//		al.add(1410);
//		System.out.println(al);
		
		System.out.println(al.size());
		

		
		
	}
	
}
