package Collection;
import java.util.*;
/*linked list & array list value acess time loop can not used bcz but for loop are not used bcz all collecton index base Acess not allow 
    like:- arraydeque,treeset, priority that reason not used */

import java.util.ArrayList;

public class col_7 
{
   public static void main(String[] args) {
    ArrayList all= new ArrayList<>();
      all.add(100);
      all.add(200);
      all.add(300);
      all.add(400);

      //....................................... value fatche..................................................
      System.out.println(".........For_Loop.................");
      for(int i=0;i<all.size();i++)
      {
        System.out.println(all.get(i));
      }
      // but for loop are not used bcz all collecton index base Acess not allow 
      //like:- arraydeque,treeset, priority that reason not used
      System.out.println(".........For_each.................");
        for (Object obj : all) 
        {
            System.out.println(obj);
        }
        
      /* concation (any cahnge ) for each not allow */
      
      System.out.println(".........iterator.................");
      // vaule fatch
      Iterator it =all.iterator();
      while (it.hasNext()) 
      {
        System.out.println(it.next());
      }
        System.out.println("..........................reverse.....................");
      //reverse Value fatch
      ListIterator lit=all.listIterator(all.size());
      while (lit.hasPrevious()) 
      {
        System.out.println(lit.previous());
      }

      
   }
}
