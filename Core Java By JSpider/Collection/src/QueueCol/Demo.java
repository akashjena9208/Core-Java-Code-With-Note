package QueueCol;

import java.util.PriorityQueue;
/*
 * another type data store classcast execption
 * dupicate allow
 * null value does not allow'
 * Highest Priority elemnt avilable
 * DS min-heap
 * */
public class Demo {
	 public static void main(String[] args) {
		 PriorityQueue pq= new PriorityQueue();
	     pq.add(100);
	     pq.add(50);
	     pq.add(150);
	     pq.add(25);
	     pq.add(75);
	     pq.add(125);
	     pq.add(175);
	     System.out.println(pq);
	}
}
