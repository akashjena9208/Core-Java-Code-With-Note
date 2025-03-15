// package Static;
import java.util.Scanner;

class farmer
{
    int pa;
    float td;
    static float ri;
    float si;

    static{
        ri=8.5f;  /*static varibale also called as class variale bcz same copy of data among used all object & class  
                    - memory allocated at a one time 
                    - when ever common copy of data which have to share among all the object & classes then you go static varibales bcz during class loading itselfmemory will be allowcoted  heap area and same copy of data will used for all the object & memory allowcated only ones so it is effecences
                     */

    }

    void input()
 {
    Scanner scan = new Scanner(System.in);
    System.out.println("plz mention the required");
    pa =scan.nextInt();
    System.out.println("plz time duration");
    td =scan.nextFloat();
    // ri=8.5f; // both sc1 object and sc2 object used
    
 }

 void cal()
{
    si=(pa*ri*td)/100;
}

void disp()
{
    System.out.println("Si is :"+si);
}
}
public class static_farmer {
    public static void main(String[] args) 
    {
        farmer sc=new farmer();
        sc.input();
        sc.cal();
        sc.disp();

        farmer sc2=new farmer();
        sc2.input();
        sc2.cal();
        sc2.disp();
    }
    
}
