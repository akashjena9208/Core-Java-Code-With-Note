package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.*;
/*2-LinkedList:-
- Linked list followed by the Dobuly linl list data structure
- Linklist  impliment both list & Deque 
- Dupplicate allow
- Inseration & Deletion operation perfom any given position Very effeciently with out effect The memory.
- Same methode as a Arraylist & Extra 


● LinkedList implements the List and Deque interface.
● It uses a doubly linked list internally to store the elements. 
● It can store the duplicate elements. 
● It maintains the insertion order and is not synchronized. 
● In LinkedList, the manipulation is fast because no shifting is required. */


public class col_2 
{
    public static void main(String[] args) {
        
        LinkedList li = new  LinkedList<>();
        //list ,deque,linklist

        li.add("Akash");
        li.add("Subha");
        li.add("Inu");
        li.add("Smruti");

        System.out.println(li);
        //Adds an item to the beginning of the list.
        li.addFirst("100");
        System.out.println(li);

        //Add an item to the end of the list
        li.addLast("Add an item to the end of the list "+200);
        System.out.println(li);

        //	Remove an item from the beginning of the list.
        li.removeFirst();
        System.out.println("Remove an item from the beginning of the list "+li);

        //Remove an item from the end of the list
        li.removeLast();
        System.out.println("Remove an item from the end of the list "+li);

//First object cheack & return collection are not effect
        System.out.println(li.peek()); // First object Return
        System.out.println(li);
//First objevt retrn  but effect if collection those have given thaose remove
        System.out.println(li.poll());
        System.out.println(li);


        System.out.println(li.get((2))); //2nd index ,object retrive
        System.out.println(li.indexOf("Inu")); // which index

        li.push(10);
        System.out.println(li);
       System.out.println(li.poll());
       System.out.println(li);

       //All class nindide the collection frame work spicfic DataStructure & algorthim
       //..................................Deque...............................


       List lll= new LinkedList<>();
       lll.add(100);
       System.out.println(lll);
       //only add , bcz Parent class is a list 
       //you can not deque like poll push
       // so always write a Linked List , Linklist both are collect










    }
}
