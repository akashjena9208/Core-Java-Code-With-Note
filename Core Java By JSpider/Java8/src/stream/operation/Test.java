package stream.operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,100, 22, 55,66,77,88,90, 33, 44,100,22,44);
		List<Integer> findList=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("All Even Number :- "+findList);
		
		//even Dived by 2 
		List<Integer> NewList=findList.stream().map(x->x/2).collect(Collectors.toList());
		System.out.println("even Number Dived by 2 "+NewList);
		
		
		//Remove dupicate
		List<Integer> DuplicateRemove=NewList.stream().distinct().collect(Collectors.toList());
		System.out.println(DuplicateRemove);
		
		
		//Sorted Order 
		List<Integer> Sorting=DuplicateRemove.stream().sorted().collect(Collectors.toList());
		System.out.println(Sorting);
		
		//Desding Order Sorted
		List<Integer> DesdingOrerSorting=	Sorting.stream().sorted((a,b)-> b-a).collect(Collectors.toList());
		System.out.println(DesdingOrerSorting);
		
		//Minimum 
		List<Integer> limitUsed=DesdingOrerSorting.stream().limit(4).collect(Collectors.toList());
		System.out.println(limitUsed);
		
		//skip first number
		List<Integer> skipthe=limitUsed.stream().skip(1).collect(Collectors.toList());
		System.out.println(skipthe);
		
	}

}
