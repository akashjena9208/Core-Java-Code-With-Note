package TypeCastingArchiveGeneraLization;

public class PersonMain 
{
	static void disp(Person obj)
	{
		if(obj instanceof Employee)
		{
			Employee e=(Employee) obj;
			System.out.println(e.name+" "+e.sal);
		}
		else if(obj instanceof Studentt )
		{
			Studentt s=(Studentt) obj;
			System.out.println(s.name+" "+s.mark);
		}
	}
	
	public static void main(String[] args) {
			disp(new Employee());
			System.out.println("-------------");
			disp(new Studentt());
	}

}
