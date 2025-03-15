package in;
 class Student
 {
	 int id;
	 String name;
	 
	 Student (int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
 }
public class StudentMain {
	public static void main(String[] args) {
		Student s1=new Student(1, "Akash");
		Student s2=new Student(1,"Akash");
		Student s3=new Student(1, "akash");
		
		System.out.println(s1==s1);
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}
}
