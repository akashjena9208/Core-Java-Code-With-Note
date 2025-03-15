package Collection;
/*1-Array list
- inside the util package all class are avilabale
- Array list are Hetrogenious Data Store(mixed type of data)
-Array list used Store rareend (end of store) & grow the size 
- array list are duplicate allow 
- System atically  addding 
- array list store Homogenious & Hetrogenious of  data store
- Arraylist implement a list interface.

The ArrayList class implements the List interface. 
● It uses a dynamic array to store the duplicate element of different data types. 
● The ArrayList class maintains the insertion order and is non-synchronized.
● The elements stored in the ArrayList class can be randomly accessed
 * 
 */
import java.util.*;
public class col_1 
{
    public static void main(String[] args) 
    {
        ArrayList obj= new ArrayList();
        //array list store Homogenious & Hetrogenious of  data store
        obj.add("Pw skill");
        obj.add("100");
        obj.add("100");
        obj.add(1.1);
        System.out.println("it is store System-metically & End of a Store a Data:-"+obj); 



    // Parent ........Child
        List all =new ArrayList<>();
        all.add(100);
        all.add(200);
        all.add(300);
        System.out.println(all);
        //inbulit Methode of a Array list
        System.out.println(all.contains(200));   // Cheack a value are their or not , return value are bolean
        System.out.println(all.indexOf(200));     //index number of Array cheack
        System.out.println(all.size());              // cheack a array size
        System.out.println(all.hashCode());
        System.out.println(all.isEmpty());
       
        

    }
}
