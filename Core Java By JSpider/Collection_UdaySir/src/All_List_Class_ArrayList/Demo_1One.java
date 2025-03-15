package All_List_Class_ArrayList;

import java.util.ArrayList;


public class Demo_1One {
	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		//add():- it is used to add an object into collection
		al.add(10);
		al.add(50);
		al.add(90);
		al.add(5);
		al.add(null);
		al.add(null);
		al.add(0);
		
		System.out.println(al);	//[10, 50, 90, 5, null, null, 0]
		
		System.out.println("-----------------size() :- it is used to  returen the length of the collection----------------------");
		//size() :- it is used to  returen the length of the collection
		System.out.println(al.size());	//7
		
		
		
		System.out.println("-------get():- it is used to return the object based on index position-------");
		//get():- it is used to return the object based on index position  
		System.out.println(al.get(2));	//90
		//if not preasnt an  collection thorow aIndex 2000 out of bounds exception
//		System.out.println(al.get(2000));
		
		
		System.out.println("--------contains():- it is used checked if the object is spresant in the collection or Not -----------");
		//contains():- it is used checked if the object is spresant in the collection or Not 
		System.out.println(al.contains(10));	//true
		System.out.println(al.contains(10000));	//false
		
		//indexof()- it is used to find the indx position of an object and first occurance in case of dupication
		System.out.println(al.indexOf(null));	//4
		System.out.println(al.indexOf(10));	//0
		System.out.println(al.indexOf(100)); // -1  if the object is not preasant
		//lastindex():-it is used to find last index position of an object
		System.out.println(al.lastIndexOf(null));	//5
		
		System.out.println("-------------	//remove() :-  it is used to remove an object based on the index based position--------------");
		System.out.println(al);	//[10, 50, 90, 5, null, null, 0]
		//remove() :-  it is used to remove an object based on the index based position
		al.remove(5);
		System.out.println(al); //[10, 50, 90, 5, null, 0]
		
		
		
		//isEmpty():-it is used checkd the collection is empty or not
		System.out.println(al.isEmpty());	//false
		System.out.println(al);//[10, 50, 90, 5, null, 0]
		
		//clear() is remove all the object of collection
		al.clear();
		
		System.out.println("-------------isEmpty():-it is used checkd the collection is empty or not-------------------------");
		System.out.println(al.isEmpty());	//true
		System.out.println(al);//[]
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
