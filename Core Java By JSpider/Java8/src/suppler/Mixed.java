package suppler;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Mixed {
	public static void main(String[] args) {
		/*Supplier is a functional interface in Java that takes no input and returns a result using its get() method. It’s useful when you need to generate or supply values on demand.”*/
		
		Supplier<String> greetSupplier = () -> "Hello, Akash!";
        System.out.println(greetSupplier.get());  // Output: Hello, Akash!
        
        
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get());  // Output: (random value like 0.6543)

        Supplier<LocalDate> dateSupplier = () -> LocalDate.now();
        System.out.println(dateSupplier.get());  // Output: today’s date

		
		
		Predicate<Integer> pi=x-> x%2==0;
		Function<Integer, Integer> fn=x->x*x;
		Consumer<Integer> co=x->System.out.println(x);
		Supplier<Integer> sp=()->100;
		
		if(pi.test(sp.get()));
		co.accept(fn.apply(sp.get()));
	}

}
