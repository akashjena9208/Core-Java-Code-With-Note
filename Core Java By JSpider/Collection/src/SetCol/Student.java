package SetCol;

public class Student {
	int id;
	double percs;
	String name;

	Student(int id,String name,double percs)
	{
		this.id=id;
		this.name=name;
		this.percs=percs;
	}

	@Override
	public int hashCode() {

		return this.id;

	}
	//if i dont  write override Different Object but that Contain are Same thats also print avoid this  problem overide the hascode 


	@Override
	public boolean equals(Object obj) {
		boolean res=false;
		if(obj instanceof Student)
		{
			if(this.hashCode()==obj.hashCode());
			{
				res=true;
			}
		}
		return res;	
	}
	//First We checked the Student type presant or not if that preasnt then compare the current object and another object so overide the equal method

	@Override
	public String toString() {
		return "Student [id=" + id + ", percs=" + percs + ", name=" + name + "]";
	}
	//foreach time object are directly print so override the toString method





}
