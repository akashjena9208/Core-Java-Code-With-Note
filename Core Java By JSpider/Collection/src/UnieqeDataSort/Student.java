package UnieqeDataSort;

import java.util.Objects;

public class Student {
	
	int id;
	String name;
	double perc;
	
	
	Student(int id,String name,double percs)
	{
		this.id=id;
		this.name=name;
		this.perc=percs;
	}
	
	@Override
	public String toString()
	{
		return id+" "+name+" "+perc;
		
	}

	@Override
	public int hashCode() {
		return this.id;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return id == other.id && Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(perc) == Double.doubleToLongBits(other.perc);
//	}
	
	@Override
	public boolean equals(Object obj)
	{
		boolean res=false;
		if(obj instanceof Student)
		{
			if(this.hashCode()==obj.hashCode())
			{
				res=true;
			}
		}
		return res;
		
	}
	
	
	
}
