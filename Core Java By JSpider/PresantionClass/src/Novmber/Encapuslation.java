package Novmber;
//WJP on Encapusulaton by using Real World Example
class Student
{
	private String name;
	private int age ;
	private int regdno;
	
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public int getRegdno() {
		return regdno;
	}




	public void setRegdno(int regdno) {
		this.regdno = regdno;
	}
	
	
	void disp()
	{
		System.out.println("Student Name:- "+name+" || "+" Student Age:- "+age+" || "+" Stugent registation Number:- "+regdno);
	}
	
	
}

public class Encapuslation 
{
	public static void main(String[] args) {
		Student s= new Student();
		s.setName("Akash");
		s.setAge(22);
		s.setRegdno(2001289215);
		s.disp();
		
		String name=s.getName();
		int regd=s.getRegdno();
		int age=s.getAge();
		
		System.out.println("Student name:----->" +name);
		System.out.println("Student id:------->" +regd);
		System.out.println("Student age:------->"+age);
		
		
	}

}
