package Collection;
/*ArrayDeque
- index base  acessing Not allow(middle mai not add)
- Araay Deque  Double endque
- Arraydeque implment linkdlist
- Arraydeque implent Deque
- Deque extend Queue 

● ArrayDeque class implements the Deque interface. 
● It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from 
both the ends.
● ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions

Queue
- one side insertion or Deletion

ArrayDeque 
- ArrayDeque internaly Double ended  Queue
- itg is a lightwight 
- inseraton & deltion  forntend or readed
- dupilicate allow */

import java.util.ArrayDeque;
import java.util.Queue;

public class col_3 
{
        public static void main(String[] args) 
        {
            ArrayDeque ad= new ArrayDeque<>();
            ad.add(100);
            ad.add(200);
            ad.add(300);
            ad.add(400);
            ad.add(500);
            System.out.println(ad);

            ad.addFirst("Akash");
            ad.addLast("Jena");
            System.out.println(ad);

            // offer also adding methode but not compolsory add it is may be reject
            ad.offer(1000);
            ad.offerFirst(10);
            ad.offerLast(20);
            System.out.println(ad);


        }
    
}