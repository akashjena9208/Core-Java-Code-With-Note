package Map;

import java.util.ArrayList;
import java.util.Collections;

public class map_5 {
        
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();

             al.add(40);
             al.add(60);
             al.add(10);
             al.add(90);
             al.add(50);
             al.add(40);


             System.out.println(al);

             Collections.sort(al);

             System.out.println(al);

             Collections.sort(al,Collections.reverseOrder());
             System.out.println(al);


             
             

    }
}
