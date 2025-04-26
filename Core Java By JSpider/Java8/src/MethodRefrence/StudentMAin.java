package MethodRefrence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMAin {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Akash","Subha","Sonu","Inu","Disha");
		List<Student> student=names.stream().map(x->new Student(x)).collect(Collectors.toList());
		System.out.println(student);
		
		//Using Constuctor refrence
		List<Student> students=names.stream().map(Student::new).collect(Collectors.toList());
		System.out.println(students);
	}

}
