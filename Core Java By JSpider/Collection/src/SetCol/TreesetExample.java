package SetCol;

import java.util.TreeSet;

public class TreesetExample {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75); 
        ts.add(125);
        ts.add(175);

        System.out.println(ts);
        
	}
}
