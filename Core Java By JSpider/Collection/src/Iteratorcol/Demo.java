package Iteratorcol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
//in this case we can not iterating ListIterator bcz parant is Collection 
public class Demo {
	public static void main(String[] args) {
		Collection<String> cl = new ArrayList<String>();
		cl.add("yellow");
		cl.add("Orrange");
		cl.add("Black");
		cl.add("Pink");
		cl.add(null);

		System.out.println(".......................For Each......................................");
		System.out.println(cl);
		for (String s : cl) {
			System.out.println(s);
		}

		System.out.println("......................Iterator..........................");
		Iterator<String> itr = cl.iterator();

		while (itr.hasNext()) {
			String elemnt = itr.next();
			System.out.println(elemnt);

			if (elemnt == null)
				itr.remove();

		}
		System.out.println(cl);
		
		
		
		

	}
}
