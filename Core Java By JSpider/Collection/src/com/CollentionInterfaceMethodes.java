package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;



public class CollentionInterfaceMethodes {
	public static void main(String[] args) {
		
		Collection<Object> ct=new  ArrayList<Object>();
		
		ct.add("Akash");
		ct.add(100);
		ct.add(2.5);
		ct.add(true);
//		ct.add(new String[]{"Java","Orcal Database"});	//Array
		ct.add(null);
		ct.add(null);
		
		System.out.println(ct);
		System.out.println("-----------------------For Each-----------------------------------");
		for (Object obj:ct)
		{
			System.out.println(obj);
		}
		
		System.out.println("----------------------------for loop------------------------------");
		for (int i=0;i<ct.size();i++)
		{
			System.out.println(i);
		}
		System.out.println("----------------------------------------------------------");
		
		Collection<Object> ctt=new  ArrayList<Object>();
		
		ctt.add("Subha");
		ctt.add("Subha");
		ctt.add(500);
		
		System.out.println(ctt);
		System.out.println("-------------------------One colection another collection add---------------------------------");
		//one colection another collection add
		ctt.addAll(ct);
		System.out.println(ctt);
		System.out.println("---------------------Using itrator-------------------------------------");
		Iterator<Object> itr=ctt.iterator();
		while(itr.hasNext())
		{
			Object	itarator=itr.next();
			System.out.println(itarator);
		}
		System.out.println(".................contains checke the value is presant or not..............................");
		System.out.println(ct.contains(100));
		System.out.println(".................contains checke the collection is presant or not..............................");
		System.out.println(ctt.containsAll(ct));
		System.out.println("------------------------------remove the Object-------------------------------------------------");
		System.out.println(ct.remove(100));
		System.out.println(ct);
		System.out.println(ctt);
		System.out.println("------------------------------remove one collection Object-------------------------------------------------");
		System.out.println(ctt.removeAll(ct));
		System.out.println(ctt);
		System.out.println("------------------------------Checked size Object-------------------------------------------------");
		System.out.println(ctt.size());
		
		System.out.println("------------------------dlt all the record--------------------------------");
		ctt.clear();
		System.out.println(ctt);
		System.out.println("--------------------------------Is Empty or not---------------------------------------------------------");
		System.out.println(ctt.isEmpty());
		
		
		
	}
}
