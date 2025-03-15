package Absraction;
/*
final class:- final key word can't particepat inheritance, you declear the final class that not inherit the child class
final variabale:-you declar the varibael that can"t be cahange
final methode:-final methode participat a final methode but that  canot override the a child

 * 
 */
// final class Animal   
// {
//     void sleep()
//         {
//                 System.out.println("final key word can't particepat inheritance");
//         }
    
// }
class Animal   
{
    //variabile
    final int age=19;

//methode
   final void sleep()
        {
            // age=20; you can not modefy
            System.out.println("variable are not change bcz declerat the final");
            System.out.println(" final methode participat a final methode but that  canot override the a child ");
        }
    
}

class tiger extends Animal
{
    // void sleep()
    // {
    //     System.out.println("can not over ride");
    // }
}

public class fiinal 
{
    public static void main(String[] args)
    {
        tiger t = new tiger();
        t.sleep();
    }
}
