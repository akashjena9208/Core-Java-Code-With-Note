// package Static;

class Demo
{
    static void disp1()
    {
        System.out.println(" static  display");
    }

    void disp2()
    {
        System.out.println("non static display");
    }
}

public class static_2 
{
    
    public static void main(String[] args)
    {

        /*java rule you call the methode  you crate object  and calling the object using refrence you mad .
         * only one case you can not creat a object this case is using " static " key word
         */

        Demo.disp1();  //object independent using with out objecct creation we call bcz used of " static " key word

        // Demo.disp2();  //error ...............  bcz you not using any object or static key word

        Demo obj=new Demo();
        obj.disp2();

    }
}
