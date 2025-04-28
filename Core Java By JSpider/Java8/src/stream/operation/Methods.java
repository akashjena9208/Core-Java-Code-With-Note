package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {
	public static void main(String[] args) {
		//Filters elements based on a condition.
		List<Integer> list0 = Arrays.asList(10, 15, 20, 25, 30);
		list0.stream()
		    .filter(n -> n > 20)
		    .forEach(System.out::println); // Output: 25, 30
		
		//Map():-Transforms each element.
		List<String> list1 = Arrays.asList("apple", "banana", "cherry");
		list1.stream()
		    .map(String::toUpperCase)
		    .forEach(System.out::println); // Output: APPLE, BANANA, CHERRY
		
		
		//Sorts elements (natural order or custom comparator).
		List<Integer> list2 = Arrays.asList(30, 10, 20, 50, 40);
		list2.stream()
		    .sorted()
		    .forEach(System.out::println); // Output: 10, 20, 30, 40, 50

		//Remove Duplicate
		List<Integer> list3 = Arrays.asList(10, 20, 10, 30, 20, 40);
		list3.stream()
		    .distinct()
		    .forEach(System.out::println); // Output: 10, 20, 30, 40

		//Limite the nUmber of Elemnet
		List<Integer> list4 = Arrays.asList(10, 20, 30, 40, 50);
		list4.stream()
		    .limit(3)
		    .forEach(System.out::println); // Output: 10, 20, 30

		
		//Skips the first N elements.
		List<Integer> list5 = Arrays.asList(10, 20, 30, 40, 50);
		list5.stream()
		    .skip(2)
		    .forEach(System.out::println); // Output: 30, 40, 50

		
		//Collects stream into a list, set, map, etc
		List<String> names = Arrays.asList("John", "Jane", "Jack");
		List<String> collected = names.stream()
		    .collect(Collectors.toList());
		System.out.println(collected); // Output: [John, Jane, Jack]

		
		//Performs an action for each element.
		List<Integer> list6 = Arrays.asList(1, 2, 3);
		list6.stream()
		    .forEach(n -> System.out.println(n * n)); // Output: 1, 4, 9

		
		//Reduces the elements to a single value.
		List<Integer> list7 = Arrays.asList(1, 2, 3, 4, 5);
		int sum = list7.stream()
		    .reduce(0, (a, b) -> a + b);
		System.out.println(sum); // Output: 15
		
		
		
		//Checks conditions:
		List<Integer> list = Arrays.asList(10, 20, 30);

		// anyMatch
		boolean anyGreaterThan25 = list.stream().anyMatch(n -> n > 25); 
		System.out.println(anyGreaterThan25); // true

		// allMatch
		boolean allGreaterThan5 = list.stream().allMatch(n -> n > 5);
		System.out.println(allGreaterThan5); // true

		// noneMatch
		boolean noneGreaterThan50 = list.stream().noneMatch(n -> n > 50);
		System.out.println(noneGreaterThan50); // true

//		/Counts elements.
		long count = Stream.of(1, 2, 3, 4, 5).count();
		System.out.println(count); // Output: 5



	}

}
