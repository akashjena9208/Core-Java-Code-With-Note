import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Trail {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lh= new LinkedHashSet<>();
		lh.add(50);
		lh.add(40);
		lh.add(10);
		lh.add(30);
		lh.add(90);
		lh.add(40);
		
	System.out.println(lh);
	
	for(Integer a:lh) {
		System.out.println(a);
	}
}
}	