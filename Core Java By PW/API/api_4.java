package API;
/* Coolecorion of data  that data  work & process used Stream Api
 * -import java.util.stream.*;
 * - one time stram creat & used doubule timme you can not acess
 */


import java.util.Arrays;
import java.util.function.Predicate;
import java.util.*;
import java.util.stream.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;
public class api_4
{
    public static void main(String[] args) 
    {
        
        List<Integer> list=Arrays.asList(8,4,2,7,5);

        Stream<Integer> streamData=list.stream(); // collection data not effect , data are imutable 

        //..............one time stram creat & used doubule timme you can not acess...................................

        //foreach
        //streamData.forEach(n->System.out.println(n));

        // Sorting the value 
        // Stream<Integer> sortedStream=filData.sorted();

        // value doubule
        // Stream<Integer> mapStream=sortedStream.map(n->n*2);

        //filter(0= EVEN, 1= ODD)
        // Stream<Integer> filter=sortedStream.map(n->n%2==0);
    
        //........................................or............................................
        
        Stream<Integer> finalStream=streamData.filter(n->n%2==0).sorted().map(n->n*2);
        // uswed xhain  bcz retrun type same so used methode

        
        finalStream.forEach(n->System.out.println(n));


        

        

    }
    
}
