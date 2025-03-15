package Encapsultion;
class Student
{
	private int age;  //used private key word so again another methode creat and value assigned  bcz out side the Student class(world) can;t assigen
	private String name;


	public void setData()
	{
		age=22;
		name="Akash";
		System.out.println(name +" "+ age);
	}

	public void disp()
	{
		System.out.println(name +" "+ age);
	}


}

public class encapsulation_1 
{
	public static void main(String[] args) 
	{
		Student obj=new Student();
		//        obj.age=22;         //out side the world value assigned
		//        obj.name="Akash";  

		obj.setData();
		obj.disp();

	}
}