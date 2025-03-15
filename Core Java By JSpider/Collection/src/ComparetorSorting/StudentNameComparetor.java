package ComparetorSorting;

import java.util.Comparator;

public class StudentNameComparetor  implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {

//		return 0;
		
/*............................................................................................................*/
		//ascending order
		return s1.name.compareTo(s2.name);		
		
		
		//Descending Order	
//		return s1.name.compareToIgnoreCase(s2.name);	//bcz of string compareTo & case senstive so IgnoreCase
	}

}
