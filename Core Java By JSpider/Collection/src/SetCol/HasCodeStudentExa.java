package SetCol;

import java.util.HashSet;
import java.util.Set;

public class HasCodeStudentExa {
	public static void main(String[] args) {
		
		
		Student s1=new Student(1, "Vikash", 77.9);
		Student s2=new Student(2, "Adarsh", 99.9);
		Student s3=new Student(3, "Swhata", 67.9);
		Student s4=new Student(1, "Vikash", 77.9);

		
		
//		Student s1=new Student();
//		s1.id=1; s1.name="Vikash"; s1.percs=77.9;
//		Student s2=new Student();
//		s2.id=2; s2.name="Adarsh"; s2.percs=97.9;
//		Student s3=new Student();
//		s3.id=3; s3.name="Swhata"; s3.percs=77.9;
//		Student s4=new Student();
//		s4.id=1; s4.name="Vikash"; s4.percs=77.9;
	
		
		Set<Student> students=new HashSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		
		for(Student std:students)
		{
			System.out.println(std);
		}
		
		
		
	}
}
