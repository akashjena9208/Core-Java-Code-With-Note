package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(30);
		list.add(80);
		list.add(50);
		list.add(90);
		list.add(100);
		list.add(40);
		
		
		System.out.println(list);
		//asending order sortiong
		Collections.sort(list);
		System.out.println(list);
		//Decending order Sorting

		
		
		
		// Using Comparator sorting Without any Extra classs only used java 8
//		Comparator<Integer> comparator=(a,b)->
//		{
//			return b-a;
//		};
//		
//		Collections.sort(list, comparator);
//		System.out.println(list);
		
		//or
			
		
		//easy way Using Comparator sorting Without any Extra classs only used java 8
		
		Collections.sort(list,(a,b)-> b-a);
		System.out.println(list);
		
		
		
	}

	

}
