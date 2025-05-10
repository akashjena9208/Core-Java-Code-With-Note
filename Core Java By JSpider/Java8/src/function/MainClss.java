package function;

import java.util.function.BiFunction;
import java.util.function.Function;

//it used  do somthing or work something 
//it accepet 2 generic 1st one input 2nd one output
public class MainClss {
	public static void main(String[] args) {
		// input //output
		Function<String, Integer> funs = new Function<String, Integer>() {

			@Override
			public Integer apply(String x) {

				return x.length();
			}
		};
		System.out.println(funs.apply("Akash"));

		// or

		Function<String, Integer> fun = x -> x.length();
		System.out.println(fun.apply("Akash"));

		// Nasted Function
		Function<Integer, Integer> function1 = x -> 2 * x;
		Function<Integer, Integer> function2 = x -> x * x * x;
		// using andThen First Function 1 is Work Then Funcationn 2
		System.out.println(function1.andThen(function2).apply(3)); // 216
		System.out.println(function2.andThen(function1).apply(3)); // 54

		// bi Function
		BiFunction<String, String, Integer> bfns = (x, y) -> x.length() + y.length();
		System.out.println(bfns.apply("Hii", "Hellloe"));

		Function<Integer, Integer> doubuleIt = x -> 2 * x;
		Function<Integer, Integer> tripuleIt = x -> 3 * x;
		// Using apply :- Do some Work
		System.out.println(doubuleIt.apply(2));// 4
		System.out.println(tripuleIt.apply(2));// 6

		//// (2 * 2) → (3 * 4) → 12 :-First apply doubleIt, then apply tripleIt on the
		//// result.
		System.out.println(doubuleIt.andThen(tripuleIt).apply(2)); // First Work doubuleIt 2 * 2 = 4 and Then Work
																	// tripuleIt

		/*
		 * 🧮 Detailed calculation Let’s plug in:
		 * 
		 * java Copy Edit doubleIt.andThen(tripleIt).apply(2) 1️⃣ doubleIt(2) → 2 * 2 =4
		 * 
		 * 2️⃣ tripleIt(4) → 3 * 4 = 12
		 * 
		 * ✅ Final result → 12
		 */

		System.out.println(tripuleIt.andThen(doubuleIt).apply(2)); // op-12 bcz tripuleIt =2*3=6 andThen doubuleIt
		// 6*2=12
		// intsce of this i used composed
		// compose(f) → It applies f first, then applies this function.
		System.out.println(doubuleIt.compose(tripuleIt).apply(2)); // op-12 inthis case 1st work tripule it =2*3=6
																	// andThen doubuleIt 6*2=12

		//identity:-whatever input is provided, it returns the exact same output without modification.
		Function<Integer, Integer> identity = Function.identity();

		int result = identity.apply(5);
		System.out.println(result); // Output: 5

		String strResult = Function.<String>identity().apply("Akash");
		System.out.println(strResult); // Output: Akash
		
		
	}

}
