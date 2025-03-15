package trail;

public class Student {
	String name;
	Integer id;
	
	
	public Student(String name, Integer id) {
	
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Student s= (Student) obj;
		if(this.id.equals(s.id))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
}
