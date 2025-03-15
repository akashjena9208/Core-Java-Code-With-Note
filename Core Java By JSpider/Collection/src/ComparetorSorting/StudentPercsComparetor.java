package ComparetorSorting;

import java.util.Comparator;

public class StudentPercsComparetor implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
//		return 0;
		
		if(s1.percs==s2.percs)
		{
			return 0;
		}
		else if(s1.percs>s2.percs)
		{
			return 1;
		}
		
		else
		{
			return -1;
		}
	}

}
