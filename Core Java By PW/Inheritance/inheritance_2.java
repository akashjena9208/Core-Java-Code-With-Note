package Inheritance;
//property & methode Inherited
// private & Constactor can not particepent in heritance
class Human1
{
    int age;
    private String name;

    Human1()  // constarcor are not inherit this case student constaror call
    {
        System.out.println("Parent class constractor");
    }

    void sleep()
    {
        age=19;
        System.out.println("Human need to a good sleep");
        System.out.println(age);
    }

}

class Student1 extends Human1
{
    // public Student1() //by defult
    // {
    //     //super
    //     //(by default Super method call parent class constractor )
    // }
    void disp()
    {
        System.out.println("The age is :"+age);
        // System.out.println("the naem is:"+name); //error bcz using privat keyword ,  PRIVATE MEMBER  can not inheritance
    }
}

public class inheritance_2 
{
    public static void main(String[] args)
    {
        Student1 std=new Student1(); //you call child cls constractor
        std.sleep();
        std.disp();
        
    }
}
