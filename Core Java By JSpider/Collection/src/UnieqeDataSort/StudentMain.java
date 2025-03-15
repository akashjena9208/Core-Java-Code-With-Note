package UnieqeDataSort;

import java.util.HashSet;
import java.util.Iterator;

import ComparetorSorting.Student;

public class StudentMain {
	public static void main(String[] args) {
		Student s1= new Student(5,"Akash",76.9);
		Student s2= new Student(7,"Subha",55.0);
		Student s3= new Student(9,"Inu",99.9);
		Student s4= new Student(12,"Himamshu",37);
		Student s5= new Student(25,"Sonu",80.0);
		Student s6= new Student(95,"Disha",60);
		
		
		HashSet<Student> lst= new HashSet<>();
		lst.add(s1);	lst.add(s3);	lst.add(s5);
		lst.add(s2);	lst.add(s4);	lst.add(s6);
		
			Iterator itr=lst.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
	}
}
