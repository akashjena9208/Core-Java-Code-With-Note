1- Inheritance:-It always speaks about reusability. using extend key word.
                -Inheritance in Java is a fundamental concept of object-oriented programming that allows a class to inherit properties and  
                 methods from another class
                 -Subclass to acquire all properties and actions of a superclass
example:- class Human  // it is a Super class // parent class // Base class
{
    int age;
    void sleep()
    {
        age=20;
        System.out.println("Human need to good sleep");
        System.out.println(age);
    }
}

class Student extends Human // it is child class // sub class // drive class
{

}

public class inheritance_1  
{
    public static void main(String[] args) 
    {
        Student st = new Student();
        st.sleep();
    }
}


//..........................MORE ON INHERITANCE.............................................
 1-PRIVATE MEMBER  can not inheritance.
 2-Constrctor can not inheritance.

 //....................................
  Types of Inheritance
 * Single level inheritance/Simple Inheritance:-one cls another cls inherit 
 * multilavel inheritance:-a cls extend to another cls that already extend another class
 * Herichical Inheritance:-one parent class multipule child class
 * multipel inheritance not avilable in java bcz


 //.................................................................................
 
inherit:- parent class to child class  inherit & child class are does not modfy that is called inherit 
Overriding :- Parent to child inherinted and your need you change or modfiy  or override that is called overriden methode
speclizedr : Such methode have not a parrent class only have a child classs

 
Override Methode In Child class:-
 * visibulit not decreesd  means parant public means child public
 * Same retarne type means parent void child void
 * Parametre same Parent and chiild
 - number of parametter are same
 - methode signature same lhs=rhs
 - return type same
 - Acess modifer same




