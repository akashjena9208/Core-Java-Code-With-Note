package Inheritance;
/* Types of Inheritance
 * Single level inheritance/Simple Inheritance:-one cls another cls inherit 
 * multilavel inheritance:-a cls extend to another cls that already extend another class
 * Herichical Inheritance:-one parent class multipule child class
 * multipule Inhritance:- are not particepet in java
*/

// Single level
class Animal
{                    
    public void sleep()
    {
        System.out.println("Animal class  Tiger clss inhert");
    }
}

class Tiger extends Animal
{

}

public class inheritance_3 
{
    public static void main(String[] args)
    {
        Tiger t=new Tiger();
        t.sleep();
    }
}