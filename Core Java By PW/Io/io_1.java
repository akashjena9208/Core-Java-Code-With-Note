package Io;
import java.io.*;
class Student
{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) 
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // inside you not right 
    // public String toString()
    // {
    //     return "Name : " + name + " | Age : " + age + " | City : " + city;
    // }

  
}

public class io_1 
{
    public static void main(String[] args) throws Exception
    {

        Student st1=new Student("Virat", 34, "Delhi");
        System.out.println(st1);

        Student st2=new Student("Sachin", 44, "Mumbai");

        System.out.println(st2);

        
       //all work done then jvm shut down
    }
    
}
