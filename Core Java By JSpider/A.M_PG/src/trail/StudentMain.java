package trail;

public class StudentMain {
	public static void main(String[] args) {
		Student s1= new Student("Akash", 100);
		Student s2= new Student("akash", 200);
		Student s3= new Student("Akash", 100);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
		
	}
	
	
}
