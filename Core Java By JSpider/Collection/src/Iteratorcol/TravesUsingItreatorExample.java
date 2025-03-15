package Iteratorcol;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TravesUsingItreatorExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(40);
		al.add(20);
		al.add(60);

		//Iterator only forward
		Iterator<Integer> itr =  al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//List itreator forward &  backward 
		System.out.println("-------------------------------------------------------------------------------");
		//forward
		ListIterator<Integer> itr1 = al.listIterator();
		while(itr1.hasNext()) {		//1st forward bcz cursor point 1st
			System.out.println(itr1.next());
		}
		System.out.println("-----List Backward Depend on forward----");
		//backwrd
		while(itr1.hasPrevious()) {		//then backward bcz cursor presant backward 
			System.out.println(itr1.previous());
		}
		//or.......................Diectly  backward............
		ListIterator<Integer> itr2 = al.listIterator(al.size());
		System.out.println("-----backard List  not dependent----");
		while(itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}
	}
}
//wjp to find the the two given stru=ing angarm string or not/