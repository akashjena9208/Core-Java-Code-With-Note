package Constructor;

/*super():- one constractor another constractor call 
*super() :-call parent class
 this():-call same class
1. The first line inside the constructor can be super()or this().

2. If we are not writing anything then compiler will generate super().

Difference b/w super(),this()?

super(),this()

● These are constructor calls
● These are used to invoke super class and current class constructor directly
● We should use only inside the constructor that to first line otherwise we
get compile time error.
 */ //...........................................................................................................................................................................................................................

class Student1 // extend object //parrent class
{
    private String name;
    private int age;

    public Student1()  //zero parametter
    {
        // super();  // first line of constactor you write or not  behind the seen compiler will generate super methode.
        this("rohan",29);
        System.out.println("zero constarctor");
        name="sonu";
        age=18;
    }

    public Student1(String name) //one parameter
    {
        this();
        this.name=name;
        age=10;
    }


    public Student1(String name ,int age)  // two parmetter
    {
        
        System.out.println("Two parameter");
        this.name=name;
        this.age=age;
        System.out.println(name+"two para "+age);
       
    }


    public void show()
    {
       System.out.println(name);
       System.out.println(age);
    }


}

public class constructor_4 
{
    public static void main(String[] args)
    {
        Student1 std=new Student1();
        std.show();

        // Student1 std1=new Student1("Akash");
        // std1.show();
        
      
    }
}