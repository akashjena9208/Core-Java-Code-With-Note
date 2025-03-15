package ComparetorSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentSortDemo {
	public static void main(String[] args) {
		Student s1= new Student(5,"Akash",76.9);
		Student s2= new Student(7,"Subha",55.0);
		Student s3= new Student(9,"Inu",99.9);
		Student s4= new Student(12,"Himamshu",37);
		Student s5= new Student(25,"Sonu",80.0);
		Student s6= new Student(95,"Disha",60);


		List<Student> lst=new ArrayList<Student>();
		lst.add(s1);	lst.add(s3);	lst.add(s5);
		lst.add(s2);	lst.add(s4);	lst.add(s6);

		System.out.println(".......................Before Sorting..........................");
		//Enhanch
		for(Student std:lst)
		{
			System.out.println(std);
		}


		//ID
		Comparator<Student> ctr= new StudentIdComparetor();

		//String
		//	Comparator<Student> ctr= new StudentNameComparetor();

		//percs
		//Comparator<Student> ctr= new StudentPercsComparetor();

		//Sorting
		// Collections.sort(lst);		... it is only comparable
		Collections.sort(lst, ctr);		// it is copmaretor

		
		
		System.out.println("..........................After Sorting.....................");
		//Enhanch
		for(Student std:lst)
		{
			System.out.println(std);
		}

	}
}
