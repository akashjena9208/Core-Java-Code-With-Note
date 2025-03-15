package Map;

import java.util.*;

class Employee
{
    private String name;
    private int empId;

    public Employee(String name, int empId)
    {
        this.name=name;
        this.empId=empId;
    }

    public String toString()
    {
        return empId + "";
    }

    @Override
    public void finalize()
    {
        System.out.println("clean up work  by GC before de allocating memoery from heap");

    }

    

}


public class map_4 
{
    public static void main(String[] args) 
    {

        Employee e=new Employee("Hyder", 171);

        // e=null;// elgibule for garbage collector

        // System.gc(); // invoking the garbage collector,
        // /*
        //  * -ineternally garbage collector call finalize methode
        //  * -finalize methode avilable object class
        //  * - help to cleanup
        //  */

        
        

        // hasmap :- garbage collecter can not collect their object
                /*
                 *   {171=Hyder}
                    {171=Hyder}
                    Last line
                     */

        WeakHashMap hm=new WeakHashMap();
        hm.put(e, "Hyder");
        System.out.println(hm);
        

        // weekhashmap collect their the object

        e=null;// eligible for garbage collection

        System.gc(); //invocking garbage collector

        System.out.println(hm);

        System.out.println("Last line");

      


       
        

        
    }
    
}
