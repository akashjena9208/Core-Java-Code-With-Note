package SortingComprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentSorting {
	
	public static void main(String[] args) {
		Student obj1= new Student(100, "Subha", 96.9);
		Student obj2= new Student(75, "Inu", 99.9);
		Student obj3= new Student(15, "Subham", 6.9);
		Student obj4= new Student(60, "Smruti", 96.9);
		Student obj5= new Student(5, "Akash", 76.6);
		Student obj6= new Student(10, "Ram", 64.5);
		Student obj7= new Student(25, "Litu", 44.9);
		
		
		List<Student> li= new ArrayList<Student>();
		li.add(obj1);	li.add(obj5);
		li.add(obj2);	li.add(obj6);
		li.add(obj3);	li.add(obj7);
		li.add(obj4);	
		
		System.out.println("............Befor Sorting....................");
		Iterator<Student> itr= li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("..............After Sorting ...............");
		Collections.sort(li);
		Iterator<Student> itr1= li.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("..............After Sorting Reverse..............");
		Collections.reverse(li);
		Iterator<Student> itr2= li.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
	}

}
