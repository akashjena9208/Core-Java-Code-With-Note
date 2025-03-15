package SortingComparator;

import java.util.Comparator;

public class CarComparator  implements Comparator<Car>{

	@Override
	public int compare(Car x, Car y) {
		
		return x.cost-y.cost;
	}
	
	

}
