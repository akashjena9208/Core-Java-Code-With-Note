package SortingComparator;

import java.util.Comparator;

public class MobileComaratorByModel implements Comparator<Mobile> {

	@Override
	public int compare(Mobile obj1, Mobile obj2) {	
		return obj1.Model.compareTo(obj2.Model);
	}
	

}
