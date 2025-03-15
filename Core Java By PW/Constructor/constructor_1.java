/*Constructor:- Object creation time initilize the code You used construtor
 * -Same name is a class name 
 * -no returent type like:-(int ,string....)
 * Public not mendotory.
  */

  package Constructor;


  class Student
  {
    int age;
    String name;
  
    Student(int age, String name)  //Object creation time initilize the code You used construtor,& Same name is a class name
    {
      this.age=age;
      this.name=name;
    }
  
    public void show()
    {
      System.out.println(name +" "+age);
    }
  
  
  }
  
   
  public class constructor_1 
  {
      public static void main(String[] args)
      {
          Student obj= new Student(22,"Akash");
          obj.show();
      }
      
  }
