Every object   know somthing with  help of varibale .
An Object   Does Somthing  with Help of Methode .


What is Encapsulation ?
-Data & methode work single unit is called Encapsulation  or
-Binding  of a Data & Methode Together into Single  unit called  Encapsulation

        Encapsulation = Data Hidding(Data out side world Directly not show ) +Data abstaraction(out side world Operation not show). 

Example:-
class Student
{
     int age;      //Using privat key word out side the  world(student class) 
    String name;


    public void disp()
    {
        System.out.println(name +" "+ age);
    }

}

public class encapsulation_1 
{
    public static void main(String[] args) 
    {
        Student obj=new Student();
         obj.age=22;         //out side the world value are assigned
         obj.name="Akash";  
        
    
        obj.disp();

    }
}


modify the Example:-
class Student
{
   private  int age;  //used private key word so again another methode creat and value assigned  bcz out side the Student class(world) cannot assigen.//

   private  String name;



   
   public void setData()
   {
     age=22;
     name="Akash";
   }

    public void disp()
    {
        System.out.println(name +" "+ age);
    }


}

public class encapsulation_1 
{
    public static void main(String[] args) 
    {
        Student obj=new Student();
        // obj.age=22;         //out side the world value assigned
        // obj.name="Akash";  
        
        obj.setData();
        obj.disp();

    }
}
