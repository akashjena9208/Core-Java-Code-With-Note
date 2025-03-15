package Generics;
/*
     * ArrayList<String> list1=new ArrayList<String>();
     * 
     * list is parent of array list
     * List<String> list1=new ArrayList<String>();
     * 
     *  collection  is a parent of list
     * Collection<Integer> list3=new ArrayList<Integer>();
     * 
     * // List<Object> list4=new ArrayList<String>(); 
     * Compile time error bcz generic tipe ko parent nehi hosekta  ex object ,string
     * 
     * premitive type also not allowd:-int,float,...
     * //List<int> list6=new ArrayList<int>();
     * 
     * 
     * you only store refrence type
     *  class gen{}
     * psvm
     * {
     * ArrayList<Gen> list= new Arraylist<gen>();
     * }
     * 
     */

import java.util.*;

//own class creat
class Gen<T>
//class name <type>
{
    T obj;

    public Gen(T obj)
    {
        this.obj=obj;
    }

    void disp()
    {
        System.out.println("The type of data is : " + obj.getClass().getName());
    }

    public T getObj()
    {
        return obj;
    }


}
public class gen_3
{
    public static void main(String[] args) 
    {
        //your own class 
        // i consider general type  so yu cinsider any type like:- Integer,String
        Gen<Integer> g=new Gen<Integer>(10);

        g.disp();
        System.out.println(g.getObj());

        System.out.println("**************************");

        Gen<String> g1=new Gen<String>("PW");

        g1.disp();
        System.out.println(g1.getObj());



    //     ArrayList<Gen> list1=new ArrayList<Gen>();

    //     List<String> list2=new ArrayList<String>();

    //     Collection<Integer> list3=new ArrayList<Integer>();

    //    // List<Object> list4=new ArrayList<String>(); CE
    //    List<Integer> list5=new ArrayList<Integer>();

    //    //List<int> list6=new ArrayList<int>();



    
    


        
    }
    
}

