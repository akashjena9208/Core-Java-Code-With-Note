package ListCol;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {

		LinkedList<Object> li = new  LinkedList<>();
		//inbulit Methode of a Liked list

		li.add("Akash");
		li.add("Subha");
		li.add("Inu");
		li.add("Smruti");

		System.out.println(li);	//[Akash, Subha, Inu, Smruti]
		//Adds an item to the beginning of the list.
		li.addFirst("100");
		System.out.println(" Effecintly Adds an item to the beginning/Frontentd of the list:- " +li);
		// Effecintly Adds an item to the beginning/Frontentd of the list:- [100, Akash, Subha, Inu, Smruti]

		//Add an item to the end of the list
		li.addLast("Effecintly Add an item to the end/rear end of the list "+200);
		System.out.println(li);
		//[100, Akash, Subha, Inu, Smruti, Effecintly Add an item to the end/rear end of the list 200]

		//	Remove an item from the beginning of the list.
		li.removeFirst();
		System.out.println("Remove an item from the beginning of the list "+li);
		//Remove an item from the beginning of the list [Akash, Subha, Inu, Smruti, Effecintly Add an item to the end/rear end of the list 200]
	
		//Remove an item from the end of the list
		li.removeLast();
		System.out.println("Remove an item from the end of the list "+li);

		//First object cheack & return collection are not effect
		System.out.println("First object cheack & return collection are not effect :-"+li.peek()); // First object Return
		System.out.println(li);
//		First object cheack & return collection are not effect :-Akash
//				[Akash, Subha, Inu, Smruti]
		
		//First objevt return  but effect if collection those have given thaose remove
		System.out.println("First objevt return  but effect thos object are returent that remove "+li.poll());
		System.out.println(li);
//		First object cheack & return collection are not effect :-Akash
//				[Akash, Subha, Inu, Smruti]
		
		
		li.push(10);	//new Object adds
		System.out.println("new Object adds :-" + li);
		
		//new oject retrive
		System.out.println("New Object Retive "+li.poll());
		System.out.println(li);

		System.out.println(li.get((2))); //2nd index ,object retrive
		System.out.println(li.indexOf("Inu")); // which index
		
		System.out.println("..........Using For Each............");
		for(Object obj:li)
		{
			System.out.println(obj);
		}

		System.out.println(".......................Using Iterator................................");
		ListIterator<Object> itr=li.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
//		System.out.println("Uisng List itreator and revrese");
//		ListIterator ltr=li.listIterator();
		System.out.println(".......................Using List Iterator................................");
		ListIterator<Object> ltr=li.listIterator(li.size());
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
		
		

		

		//All class insdide the collection frame work spicfic DataStructure & algorthim
		//..................................Array Deque...............................


		List lll= new LinkedList<>();
		lll.add(100);
		System.out.println(lll);
		//only add , bcz Parent class is a list 
		//you can not deque like poll push
		// so always write a Linked List , Linklist both are collect
		
		
		
	}
}
