package SetCol;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Dem {
	public static void main(String[] args) {
		Set set= new HashSet();
		
		set.add("Devera");
		set.add(null);
		set.add("Bahuvali");
		set.add("Kgf");
		set.add("Puhpa");
		set.add("Aryan");
		set.add("TmKOC");
		set.add("Max");
		set.add("Devera");
		set.add("Lucky bhaskar");
		set.add(1);
		
		//Duplicate Not Allow so Maintain Unqienesss
		//
		System.out.println(set);
		
		Iterator<Dem> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}
}
