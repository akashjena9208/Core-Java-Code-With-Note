package Map;

import java.util.*;
import java.util.Map.*;

class Student999
{
    private String name;
    private int age;
    private String city;

    public Student999(String name,int age, String city)
    {
        this.name=name;
        this.age=age;
        this.city=city;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    //...............override to string............................
    public String toString()
    {
        return name + " " + age + " " + city;
    }


}

public class map_2 
{
    public static void main(String[] args) 
    {
        Student999 st1=new Student999("Rohan", 18, "Bengaluru");
        Student999 st2=new Student999("Rohit", 19, "Delhi");
        Student999 st3=new Student999("Ramesh", 22, "Mysuru");

        Map map=new HashMap();
        map.put(1, st1); //accepting the object
        map.put(2, st2);
        map.put(3, st3);

        System.out.println(map);  //after overide
        // Actuall value not get , Hash Code vaule are Acess 
        /*//interannay call tostring
        //if u overide tostring get the value
         * tostring()
         * {
         * 
         * }
         */
        Set set=map.entrySet();
        Iterator itr=set.iterator();

        while(itr.hasNext())
        {
            //System.out.println(itr.next());
            Map.Entry data=(Entry)itr.next();
            System.out.println(data.getKey() + " : " + data.getValue());
            
        }



    }
}
