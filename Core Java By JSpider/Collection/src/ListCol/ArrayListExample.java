package ListCol;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> obj= new ArrayList<String>();
		//array list store Homogenious & Hetrogenious of  data store
		obj.add("Pw skill");
		obj.add("100");
		obj.add("100");
		obj.add("1.1");
		System.out.println("it is store System-metically & RareEnd of a Store a Data:-"+obj); 



		// Parent ...............Child
		List<Integer> all =new ArrayList<>();
		all.add(100);
		all.add(200);
		all.add(300);
		System.out.println(all);
		//inbulit Methode of a  List
		System.out.println(all.contains(200));   // Cheack a value are their or not , return value are bolean
		System.out.println(all.indexOf(200));     //index number of Array cheack
		System.out.println(all.size());              // cheack a array size
		System.out.println(all.hashCode());
		System.out.println(all.isEmpty());
		System.out.println(all.get(1));
		
		//inbulit Methode of a Array list
		System.out.println("......inbulit Methode of a Array list......");
		//Ensure that / minimum  10 capacity resrve
		((ArrayList) all).ensureCapacity(10);
		System.out.println();
		//Remove the extra space
        ((ArrayList) all).trimToSize();
        System.out.println(all.size());
	}
}
