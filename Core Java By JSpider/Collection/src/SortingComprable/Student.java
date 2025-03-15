package SortingComprable;

public class Student  implements Comparable<Student>
{
	int id;
	String name;
	double percs;
	
	Student(int id,String name,double percs)
	{
		this.id=id;
		this.name=name;
		this.percs=percs;
	}
	
	
	@Override
	public String toString()
	{
		
		return "Id:- "+id+" Name:-  "+name+" Percs:-  "+percs;
		
		
		
	}


	//.....................................Based On ID.....................................................
/*
	@Override
	public int compareTo(Student inttypeobj) {
		
		return this.id-inttypeobj.id;
		
		
	}
	*/

/*
	//.......................................String ..............................................
	@Override
	public int compareTo(Student obj) {
		
		//Ascending order
		 return this.name.compareTo(obj.name);
		
		//or it is used  not case sensetive
		//return this.name.compareToIgnoreCase(obj.name);
		
		
		
		//Descending order
//		return obj.name.compareTo(this.name);
		//or
	
		//or it is used  not case sensetive
//		return obj.name.compareToIgnoreCase(this.name);
		
	}
	
*/
	
	
	@Override
	public int compareTo(Student obj) {
		
//		return (int) (this.percs-obj.percs);
		if(this.percs==obj.percs) {
			return 0;
		}
		else if(this.percs>obj.percs){
			return 1;
		}
		else
		{
			return -1;
		}
	
	
	}
	
}
