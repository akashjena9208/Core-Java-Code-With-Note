package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		//Whatever you pass → it returns as-is.
		//Not return any thing only used or print 
		
		
		
		Consumer<String> consumer=s-> System.out.println(s);
		consumer.accept("Akash");
		
		Consumer<List<Integer>> liConsumer=li->{
			for(Integer i:li)
			{
				System.out.println(i+100);
			}
		};
		
		liConsumer.accept(Arrays.asList(1,2,3,4,5));
		
		System.out.println("--------------------------");
		Consumer<List<Integer>> liConsumer1=li->{
			for(Integer i:li)
			{
				System.out.println(i+100);
			}
		};
		Consumer<List<Integer>> liConsumer2=li->{
			for(Integer i:li)
			{
				System.out.println(i+100);
			}
		};
		
		
		liConsumer2.andThen(liConsumer2).accept(Arrays.asList(1,2,3,4));;
		
		System.out.println("==================");
		List<String> names = List.of("Akash", "Rohit", "Sneha");

		names.forEach(name -> System.out.println(name));
		
		
		System.out.println("==================");
		
		//Consumer
		Consumer<Integer> print=x->System.out.println(x);
		print.accept(5);
		
		List<Integer> list=Arrays.asList(1,2,3);
		
		Consumer<List<Integer>> prConsumer=x->
		{
			for(int i:x)
			{
				System.out.println(i);
			}
		};
		prConsumer.accept(list);
		
		
		

		

		
		
		
	}
	


}
