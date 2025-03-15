package Encapsultion;

/* Shadowing problem :-if two varibale instance and local both name are same  that cases one pronlrm that caleed Shadowing problem
 * or
 * If both local variable & instance varibale The same name inside the methode then resulte is  non clash (confisued).
 * and jvm always performance local varibale tis approach is called  so.
 * ex:-class{
 *          int age;
 *           public void(int age)
 *             {
 *              age(instance)=age(local)
 *             }
 * }
 */

/*This :- it is reffering to current object.
 */
class Student10
//instance varibale
{
   private  int age; 
   private  String name;       


   public void setData1(int age, String name) // we change the varribale name a to age 
   //local varible
    {
        // Student obj= new Student();
        // obj.age=age;
        // obj.name=name;
                        //hints proved it is a instance variable & new object so we used a this key word 
       this.age=age;   
       this.name=name; 

     /*always prefornce local varibale  */
    }
   public void setData2(int a ,String b)
   {
     age=a;
     name=b;
   }

    public void disp()
    {
        System.out.println(name +" "+ age);
    }


}

public class encapsulation_4 
{
    public static void main(String[] args) 
    {
        Student10 obj1=new Student10();
        Student10 obj2=new Student10();
       
        
        obj1.setData1(21 ,"Akash");
        obj1.disp();

        obj2.setData2(22,"Subha");
        obj2.disp();

    }
}