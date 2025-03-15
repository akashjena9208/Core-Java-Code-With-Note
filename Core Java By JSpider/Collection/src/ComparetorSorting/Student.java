package ComparetorSorting;

public class Student {
	int id;
	String name;
	double percs;
	
	
	public Student(int id, String name, double percs) {
		this.id = id;
		this.name = name;
		this.percs = percs;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percs=" + percs + "]";
	}
	
	//many methodes of Student class --------------->business methods
	
	public void sleep()
	{
		
	}
	
	public void study()
	{
		
	}
	
	//Don't Write any Sorting Logic
	
}
