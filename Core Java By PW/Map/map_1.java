package Map;
import java.util.*;
import java.util.Map.*;

/*1- HashMap
- hasmap impliment a map 
- order of insertion not follwed
● Java HashMap allows null key and null values.
● HashMap is not an ordered collection. You can iterate over HashMap entries through keys set but 
they are not guaranteed to be in the order of their addition to the HashMap.
● HashMap is almost similar to Hashtable except that it’s non-synchronized and allows null key 
and values */
public class map_1
{
    public static void main(String[] args) 
    {
         HashMap hs=new HashMap();
         hs.put(07,"Dhoni"); //.........................................key uniqe
         hs.put(18,"VIRAT"); //..........................................value not unique
         hs.put(45, "Rohit");
         hs.put(null, null); //.........................................null value store
         hs.put("Akash ", "jena"); //....................................not mendotary key are integer, store  data objwct type  

         System.out.println(hs);  //- order of insertion not follwed , it is followed by hashtable


        
        System.out.println("............................................How to Acess...................................................................");
         
        Map map=new HashMap();
        map.put(1, "Rohan");//Entry
        map.put(2, "Rohit");
        map.put(3, "Rahul");
        map.put(4, "Ramesh");

        System.out.println(map);
        // key acees
         //key set reurn type set 
         // inside the map itterta not possibule but Inside the set possibule
        System.out.println(map.get(4));

        Set keySet=map.keySet();//........................... return keys
        Iterator itr1=keySet.iterator();
        while(itr1.hasNext())
        {
            // System.out.println(itr1.next()); //..................................data store object type , object is  Inyeger type
            Integer key=(Integer)itr1.next();
            System.out.println(key);
            
        }
        System.out.println("................Only value Acess.................");
        // System.out.println("value returen collection "+map.values()); //...........................value returen collection 
        Collection values=map.values();
        Iterator itr2=values.iterator();
        while(itr2.hasNext())
        {
               // System.out.println(itr2.next()); //..................................data store object type , object is  String type so  dow cast
               String names=(String)itr2.next();
               System.out.println(names);
        }
        System.out.println("...........................Both key & Value.................");
        Set entrySet=map.entrySet();
        Iterator itr3= entrySet.iterator();
        while(itr3.hasNext())
        {
         //System.out.println(itr3.next());

         Map.Entry data=(Entry)itr3.next();
         System.out.println(data.getKey() + " : " + data.getValue());
        }






        


    }
}
