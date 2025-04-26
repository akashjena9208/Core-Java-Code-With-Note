package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		
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
	}

}
