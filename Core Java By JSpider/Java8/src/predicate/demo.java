package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
//it returen boolean 
//it is functional inerface
//it is used condition checked
public class demo {
	public static void main(String[] args) {
		//Annonomius
//		Predicate<Integer> p1=new Predicate<Integer>() {
//			
//			@Override
//			public boolean test(Integer t) {
//				
//				return false;
//			}
//		};
		
		
		Predicate<Integer> p1= (t)->t>1000;
		System.out.println("Return Bollean value :- "+p1.test(999));
		//condition store varibale
		int sal=9000;
		if(p1.test(sal))
		{
			System.out.println(p1.test(sal));
			System.out.println("More then");
		}
		else
		{
			System.out.println(p1.test(sal));
			System.out.println("less Then");
		}
		
		System.out.println("..........................");
		Predicate<Integer> isEven=x->x%2==0;
		
		List<Integer> li=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		for(Integer n:li)
		{
			if(isEven.test(n))
			{
				System.out.println(n);
			}
		}
		
		
		//ByPredicate :- 2 argument accept 
		BiPredicate<Integer, Integer> bi=(x,y)-> x%2==0 && y%2==0;
		System.out.println(bi.test(2, 4));
		
		
		
		
	}

}
