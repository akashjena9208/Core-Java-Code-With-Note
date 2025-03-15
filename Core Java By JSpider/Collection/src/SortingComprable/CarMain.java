package SortingComprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

class Cars  implements Comparable<Cars>{

	int cost;
	Cars(int cost)
	{
		this.cost=cost;
	}
	

//	@Override
//	public int hashCode() {
//		return cost;
//	}

	


	@Override
	public int compareTo(Cars obj) {
		
		return  this.cost-obj.cost;
	}	
	
	public String toString()
	
	{
		return "Car Cost "+ cost;
		
	}
}

public class CarMain
{
	public static void main(String[] args) {
		Cars obj= new Cars(500);
		Cars obj1= new Cars(9500);
		Cars obj2= new Cars(5700);
		Cars obj3= new Cars(4500);
		Cars obj4= new Cars(3500);
		Cars obj5= new Cars(7500);
		 
		TreeSet<Cars> t= new TreeSet<>();
//		List<Cars> t= new ArrayList<>();
		t.add(obj);
		t.add(obj1);
		t.add(obj2);
		t.add(obj3);
		t.add(obj4);
		t.add(obj5);
		
//		for(Cars car:t)
//		{
//			System.out.println(car);
//		}
		//if used tree set dont write any thing treeset used for sorting
		System.out.println("-------If you used array then used --------");
//		Collections.sort(t);
		
		
		for(Cars car:t)
		{
			System.out.println(car);
		}
		
	}
	
	
}

