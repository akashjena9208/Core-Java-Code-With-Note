package SetCol;

public class Account {
	long accnumber;
	String name;
	double sal;
	
	Account(long accnumber,String name,double sal)
	{
		this.accnumber=accnumber;
		this.name=name;
		this.sal=sal;
	}

	@Override
	public String toString() {
		return "Account Number=" + accnumber + ", Acount HolderName=" + name + " Sal= " + sal;
	}
	
	
	
	
	
}
