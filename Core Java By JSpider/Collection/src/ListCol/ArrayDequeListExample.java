package ListCol;

import java.util.ArrayDeque;

public class ArrayDequeListExample {
	public static void main(String[] args) {
		ArrayDeque<Object> ad= new ArrayDeque<>();
		ad.add(100);
		ad.add(200);
		ad.add(300);
		ad.add(400);
		ad.add(500);
		System.out.println(ad);

		ad.addFirst("Akash");
		ad.addLast("Jena");
		System.out.println(ad);
		System.out.println("-----------------------------");
		// offer is also  smilar to   adding add()  methode but not complosory to add .it is may be element add or reject
		ad.offer(1000);	//add rarend
		ad.offerFirst(10);	//add first
		ad.offerLast(20);	//add last
		System.out.println(ad);
	}
}
