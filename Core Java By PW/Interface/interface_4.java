package Interface;

import Interface.outer.iiner;

// Inner class:- class inside the class is a inner class
//outer class not used a static
//inner classs used static
class outer
{
    public void show()
    {
        System.out.println("it is a outer class");
    }
    class iiner
    {
            public void run()
            {
                System.out.println("i'm inner class");
            }
    }
    //static inner class
//    static class iiner1
//     {
//             public void run1()
//             {
//                 System.out.println("i'm  static inner class");
//             }
//     }
}

public class interface_4 
{
    public static void main(String[] args) 
    {
        outer a= new outer();
        a.show();

        // how to call inner class
        outer.iiner oi= a.new iiner();
        oi.run();

        //static inner class so object not creat dirctly used class namr
        // outer.iiner1 i =new outer.iiner1();

        
    }
}
