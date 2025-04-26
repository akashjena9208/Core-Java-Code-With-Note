package sorting;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Calculator {
	
	public static void main(String[] args) {
		
		Set<Integer> list=  new TreeSet<>();
		list.add(30);
		list.add(80);
		list.add(50);
		list.add(90);
		list.add(100);
		list.add(40);
		
		System.out.println("Assenssding Sorting "+list);
		
		Set<Integer> s=  new TreeSet<>((obj1,obj2)->(obj2-obj1));
		s.add(30);
		s.add(80);
		s.add(50);
		s.add(90);
		s.add(100);
		s.add(40);
		
		System.out.println("Desding Sorting Sorting "+s);
		
		
	}
	

}
