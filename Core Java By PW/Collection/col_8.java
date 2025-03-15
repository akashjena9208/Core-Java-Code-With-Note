package Collection;
import java.util.*;
import java.util.concurrent.*;

// linklist and arary list  modfycation time loop not used bcz loop are infanite time lopping


public class col_8 
{
    public static void main(String[] args) 
    {
      ArrayList all= new ArrayList<>();
      all.add(100);
      all.add(200);
      all.add(300);
      all.add(400);

    //   System.out.println(".........For_Loop.................");
    //   for(int i=0;i<all.size();i++)
    //   {
    //     System.out.println(all.get(i));
    //     all.add(10); // not modfy arry are incresed infanite time
    //   }

    //.........................................fail fast...........................................................
    Iterator it =all.iterator();
      while (it.hasNext()) 
      {
        System.out.println(it.next());
        // all.add(10);  //..................................................fail fast, with exception
      }
      //......................................fail fast......................................................
      CopyOnWriteArrayList al= new CopyOnWriteArrayList<>();
      al.add(100);
      al.add(200);
      al.add(300);
      al.add(400);
      System.out.println("object print"+al);

      Iterator it1 =al.iterator();
      while (it1.hasNext()) 
      {
        System.out.println(it1.next());
        al.add(10);  //..................................................fail safe , without any exception not concat
      }



    }
}
