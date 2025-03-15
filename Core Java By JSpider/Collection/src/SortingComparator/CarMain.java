package SortingComparator;

import java.util.*;




public class CarMain {
	public static void main(String[] args) {
		Car obj=new Car(6200);
		Car obj1=new Car(7200);
		Car obj2=new Car(9300);
		Car obj3=new Car(8400);
		Car obj4=new Car(1500);
		
		List<Car> li=new ArrayList<Car>();
			li.add(obj);	li.add(obj3);	li.add(obj1);
			li.add(obj2);	li.add(obj4);
			
		System.out.println(li);
		Comparator<Car> ctr=new CarComparator();
		Collections.sort(li, ctr);
		System.out.println(li);
		
		System.out.println("..............Forward Using Iterator..................");
		Iterator<Car> itr=li.iterator();
		while(itr.hasNext())
		{
			Car it=itr.next();
			System.out.println(it);
		}
		
		System.out.println("........Backward Using List Iterator........ ");
		ListIterator<Car> litr=li.listIterator(li.size());
		while(litr.hasPrevious())
		{
			Car lit=litr.previous();
			System.out.println(lit);
		}
	}
	

}
