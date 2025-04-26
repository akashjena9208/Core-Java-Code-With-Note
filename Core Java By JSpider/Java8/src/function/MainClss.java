package function;

import java.util.function.BiFunction;
import java.util.function.Function;
//it used  do somthing or work something 
//it accepet 2 generic 1st one input 2nd one output
public class MainClss {
	public static void main(String[] args) {
				//input	//output
		Function<String, Integer> funs= new Function<String, Integer>() {
			
			@Override
			public Integer apply(String x) {
				
				return x.length();
			}
		};
		System.out.println(funs.apply("Akash"));
		
		//or
		
		Function<String, Integer> fun= x-> x.length();
		System.out.println(fun.apply("Akash"));
		
		
	//Nasted Function
		Function<Integer,Integer> function1=x->2*x;
		Function<Integer,Integer> function2=x->x*x*x;
		
		System.out.println(function1.andThen(function2).apply(3)); //216
		System.out.println(function2.andThen(function1).apply(3)); //54

		
		
		//bi Function
		BiFunction<String, String,Integer> bfns= (x,y)->x.length()+y.length();
		System.out.println(bfns.apply("Hii", "Hellloe"));
		
		
		
		
	}

}
