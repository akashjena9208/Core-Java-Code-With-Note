package MultiTheding;
/*
 * Main Thread:-
 * -Inside the java application Activity task perform to need to Thread
 * - Thread Means line of execution
 * -you creat a java program Automatically by defult behind the scean craet Thread that is main thread
 * 
 * 
 * multipule thread
 * -multipule task simoltaniosly so creat a multipule task
 * -Thread Used a Inbulid class
 * 
 *
 */

public class mul_2 
{
    public static void main(String[] args) 
    {
        System.out.println("Main thread :- it is a creat bydefult");

        //current thread naem cheack
        String name= Thread.currentThread().getName();
        System.out.println("The Main thread name is : "+name);

        //Priority Cheack
        System.out.println("By Defult Thread Pirority is "+Thread.currentThread().getPriority());


        // main thread name change // Priority Change
        Thread t =Thread.currentThread();
        t.setName("My Thread");
        t.setPriority(1);
        System.out.println("After cahnging");
        String name1= Thread.currentThread().getName();
        System.out.println("Thread name is : "+name1);
        System.out.println("Thread Pirority is :"+Thread.currentThread().getPriority());

    }
}
