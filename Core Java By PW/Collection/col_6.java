package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class col_6 
{
    public static void main(String[] args) 
    {
        HashSet hs= new HashSet<>();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(175);
        System.out.println(hs);

        LinkedHashSet Lh=new LinkedHashSet();
        Lh.add(100);
        Lh.add(50);
        Lh.add(150);
        Lh.add(25);
        Lh.add(75);
        Lh.add(125);
        Lh.add(175);
        System.out.println(Lh);

    }
}