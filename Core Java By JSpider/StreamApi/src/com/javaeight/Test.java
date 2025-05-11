package com.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(5, 6, 1, 2, 4, 5, 7, 2);

		System.out.println(arr.stream().sorted().distinct().collect(Collectors.toList()));

		// return length is more then 3
		List<String> names = Arrays.asList("Anna", "Bob", "Charlie", "David");
		List<String> op = names.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
		System.out.println(op);

		// sq and dort
		List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 6);
		List<Integer> sqsort = numbers.stream().map(x -> x * x).sorted().toList();
		System.out.println(sqsort);

		// sum the value
		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(integers.stream().reduce(0, (a, b) -> a + b));
		System.out.println(integers.stream().reduce(Integer::sum).get());
		
	}

}
