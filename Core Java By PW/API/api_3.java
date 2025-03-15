package API;

//for each

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.*;
public class api_3 
{
    public static void main(String[] args) 
    {
       
        // List<Integer> list1=new ArrayList<Integer>();
        // list1.add(2);
        // list1.add(4);
        // list1.add(5);
        // list1.add(8);
        // list1.add(9);

        // System.out.println(list1);
                                        //or

        List<Integer> list2=Arrays.asList(2,4,5,8,9);
        System.out.println(list2);

        //Enhanch forLoop
        // for(Integer i:list2)
        // {
        //     System.out.println(i);
        // }
            //consumer interface is a functional
        //Consumer<Integer> cons=i-> System.out.println(i);

        
            //for each
        list2.forEach(i->System.out.println(i));
        
    }
    
}

