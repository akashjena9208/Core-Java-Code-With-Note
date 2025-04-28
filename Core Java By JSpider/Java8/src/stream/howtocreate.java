package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class howtocreate {
	public static void main(String[] args) {
		// From Collections: You can create streams from collections like lists, sets,
		// or maps using the stream() method
		List<String> li = Arrays.asList("Apple", "Banan", "Cherry", "Amkc");
		Stream<String> listStream = li.stream();

		// From Arrays: Arrays can be converted to streams using the Arrays.stream()
		Integer i[] = { 101, 102, 103, 104 };
		Stream<Integer> arrayStream = Arrays.stream(i);
		
		
		//Using Stream.of(): You can create a stream directly from individual elements or from an array of elements using Stream.of()
		Stream<Integer> streamOfStream = Stream.of(1, 2, 3);

		//Using Stream.iterate(): You can create a stream by iterating over elements based on a seed value and a function to apply to each element to get the next one. For example:
		Stream<Integer> iterateStream = Stream.iterate(0, n -> n + 1).limit(100);
		
		//Using Stream.generate(): You can generate a stream from a supplier function that produces elements dynamicall
		Stream<String> generatedStream = Stream.generate(() -> "element").limit(10);

		//From Stream Builder: Java 9 introduced Stream.Builder interface which can be used to build streams dynamically. For example:
		Stream.Builder<String> builder = Stream.builder();
		builder.add("apple").add("banana").add("cherry");
		Stream<String> builtStream = builder.build();
		
		
		//using I/o


	}

}
