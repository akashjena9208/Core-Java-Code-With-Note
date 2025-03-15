package Inheritance;

class Human  // it is a Super class // parent class // Base class
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
