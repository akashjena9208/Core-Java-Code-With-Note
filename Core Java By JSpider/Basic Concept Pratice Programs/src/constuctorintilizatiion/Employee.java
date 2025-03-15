package constuctorintilizatiion;

public class Employee 
{

	int id;
	String name;
	double  sal;

	public Employee(int id,String name,double sal) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.sal=sal;	
	}

	public static void main(String[] args) 
	{
		Employee e1=new Employee(1, "Akash", 50000);
		Employee e2=new Employee(2,"Subha", 1000000);

		System.out.println(e1.id+" "+e1.name+" "+e1.sal);
		System.out.println(e2.id+" "+e2.name+" "+e2.sal);
		
	}

}
