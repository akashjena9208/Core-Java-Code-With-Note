package Constructor;
/*Constructor Overloading/ConstructorChaining
- writiing multipule constractor differnt parametter.
● A class can contain more than one constructor and all these constructors have the same name they differ only in the type of argument, hence these
constructors are considered as "Overloaded constructor". */

class Student1
{
    String name;
    int age;

    public Student1()  //zero parametter
    {
        System.out.println("zero constarctor");
        name="sonu";
        age=18;
    }

    public Student1(String name) //one parameter
    {
        this.name=name;
        age=10;
    }


    public Student1(String name ,int age)  // two parmetter
    {
        this.name=name;
        this.age=age;
    }


    public void show()
    {
       System.out.println(name);
       System.out.println(age);
    }


}

public class constructor_3
{
    public static void main(String[] args)
    {
        Student1 std=new Student1();
        std.show();

        Student1 std1=new Student1("Akash");
        std1.show();

        Student1 std2=new Student1("Subha" ,28 );
        std2.show();
    }
}
