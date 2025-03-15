package SortingComprable;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Demo2 {
	public static void main(String[] args) {
		List<String> vi=new Vector<String>();
		vi.add("Akash");
		vi.add("Subah");
		vi.add("Sony");
		vi.add("Inu");
		vi.add("Disha");
		
		System.out.println(vi);
		ListIterator<String> li= vi.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		Collections.sort(vi);
		
		
		System.out.println(vi);
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
		
		
	}
}
