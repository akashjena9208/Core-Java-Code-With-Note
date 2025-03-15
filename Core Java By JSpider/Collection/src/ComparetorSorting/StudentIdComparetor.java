package ComparetorSorting;

import java.util.Comparator;

public class StudentIdComparetor   implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
	

		
		//................................... Accenndig.........................................
		
		// return s1.id-s2.id;
		
//		Integer id=s1.id;
//		return id.compareTo(s2.id);
		
		//or
		
//		if(s1.id==s2.id)
//		{
//			return 0;
//		}
//		else if(s1.id>s2.id)
//		{
//			return 1;
//		}
//		
//		else
//		{
//			return -1;
//		}
		
		
		
		//................................Decending order.............................................
		
	
		
	//  	return s2.id-s1.id;
		
		//or
		

		Integer id=s2.id;
		return id.compareTo(s1.id);
		//or
		
		
//		if(s1.id==s2.id)
//		{
//			return 0;
//		}
//		else if(s1.id<s2.id)
//		{
//			return 1;
//		}
//		
//		else
//		{
//			return -1;
//		}
	}

}
