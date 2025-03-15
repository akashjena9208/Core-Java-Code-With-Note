
public class Emp {
	int id;
	double sal;
	
	

	public Emp(int id, double sal) {
		super();
		this.id = id;
		this.sal = sal;
	}
	
	
	public int hashCode() {
		return id;
	}
	
	
	public static void main(String[] args) {
		Emp e1 = new Emp(101,20.4);
		Emp e2 = new Emp(106,20.6);
		System.out.println(e1);
//		System.out.println(e2.hashCode());
		
	}

}
