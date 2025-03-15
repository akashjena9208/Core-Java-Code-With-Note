package SortingComparator;

import java.util.Comparator;

public class MobileComaratorByprice implements Comparator<Mobile> {

	@Override
	public int compare(Mobile obj1, Mobile obj2) {	
		return obj1.price-obj2.price;
	}
	

}
