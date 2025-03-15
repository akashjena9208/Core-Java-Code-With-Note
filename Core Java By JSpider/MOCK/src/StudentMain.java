import java.util.TreeSet;

public class StudentMain {
	
	public static void main(String[] args) {
		Student st= new Student(10);
		Student st1= new Student(40);
		Student st2= new Student(90);
		Student st3= new Student(40);
		Student st4= new Student(30);
		
		TreeSet<Student> t=new TreeSet<>();
		t.add(st);
		t.add(st1);
		t.add(st2);
		t.add(st3);
		t.add(st4);
		
	for(Student ob:t)
	{
		System.out.println(ob.id);
	}
	}

}
