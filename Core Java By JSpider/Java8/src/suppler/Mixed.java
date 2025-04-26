package suppler;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Mixed {
	public static void main(String[] args) {
		Predicate<Integer> pi=x-> x%2==0;
		Function<Integer, Integer> fn=x->x*x;
		Consumer<Integer> co=x->System.out.println(x);
		Supplier<Integer> sp=()->100;
		
		if(pi.test(sp.get()));
		co.accept(fn.apply(sp.get()));
	}

}
