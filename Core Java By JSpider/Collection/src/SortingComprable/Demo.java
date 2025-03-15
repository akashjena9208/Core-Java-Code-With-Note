package SortingComprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {

	public static void main(String[] args) {
		List<Integer> li= new ArrayList<Integer>();
		li.add(90);
		li.add(10);
		li.add(53);
		li.add(84);
		li.add(13);
		li.add(5);
		
		System.out.println("Before Sorting "+li);
		
		Collections.sort(li);
		
		System.out.println("After Sorting "+li);
		
		//ForWard
		Iterator<Integer> itr=li.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("------------------------------");
		
		
		
		
		
	}

	
}
