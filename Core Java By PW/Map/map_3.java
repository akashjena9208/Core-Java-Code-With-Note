package Map;

import java.util.Hashtable;
import java.util.TreeMap;
/*load factor 0.75 or 75% (inside hash table 75% full automatically incrised  & buggy double )
 * - dynamically grow
 * hastabel is synonised
 * hastabel is saftey
 * - hasmap not store in null value
 * - dupicate not alloew
 */

public class map_3 
{
    public static void main(String[] args) 
    {
        Hashtable ht=new Hashtable();
       ht.put(1, "Rohit");
       //ht.put(2, "Rohan");
       ht.put(3, "Ramesh");
      // ht.put(null, "Hyder");
      ht.putIfAbsent(2, "Rohan");

       System.out.println(ht);


       TreeMap tm=new TreeMap();

        Integer i=new Integer(5);
        // unorder value 
        // order of insration not pressre
        // sorted order
        // but accending sorting order
        // tree map sote object as key & object
       tm.put(i, "Rohit"); //..........................hitrogenious, not restriction of objrct
       tm.put(1, "Ramesh");
       tm.put(4, "Rahul");
       tm.put(3, "Rohsn");

       System.out.println(tm);

    }
}
