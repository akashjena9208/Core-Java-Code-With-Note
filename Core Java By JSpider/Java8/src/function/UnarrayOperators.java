package function;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnarrayOperators {
	public static void main(String[] args) {
		//inthis case We used both time Integer instce of this we used  unnary opertor
		 Function<Integer, Integer> fn=x->x*x;
		 System.out.println(fn.apply(10));
		 //or if both same 
		 UnaryOperator<Integer> up=x->x*x;
		 System.out.println(up.apply(10));
	}

}
