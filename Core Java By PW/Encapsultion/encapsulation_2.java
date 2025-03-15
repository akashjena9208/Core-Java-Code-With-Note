package Encapsultion;

/*Public :-Can be acess any where some class other class
 * private:- it is used for some classs
 */
class Student1

{
   private  int age; 
   private  String name;


   public void setData1(int a)
   {
     age=a;
     name="Akash";
   }
   public void setData2(String b)
   {
     age=40;
     name=b;
   }

    public void disp()
    {
        System.out.println(name +" "+ age);
    }


}

public class encapsulation_2 
{
    public static void main(String[] args) 
    {
        Student1 obj1=new Student1();
        Student1 obj2=new Student1();
       
        
        obj1.setData1(15);
        obj1.disp();

        obj2.setData2("Subha");
        obj2.disp();

    }
}