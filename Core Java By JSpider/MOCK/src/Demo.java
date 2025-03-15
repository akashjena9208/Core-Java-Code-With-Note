import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		ArrayList  l1 = new ArrayList<>();
		
		
		ArrayList l2 = new ArrayList();
		l1.add(10);
		l2.add(20);
		
		l1.addAll(l2);
		l1.add(l2);
		
		
		for(Object a:l1) {
		System.out.println(a);
		
		
	}

	

	
	
	


	}

	private static void add(List<Integer> l2) {
		// TODO Auto-generated method stub
		
	}
}