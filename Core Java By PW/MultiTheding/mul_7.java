package MultiTheding;
/*
 * Join:-Java allows one thread to wait until another thread completes its execution.
 * isAlive:-We can determine if a thread is currently alive or not by calling a Thread instance's isAlive() method
 */

class joinalive implements Runnable
{
    public void run()  
    {
        System.out.println("thread is a parent class state child class");

        ////....................................................Blocked 
        try  
        {
            
            for(int i=0;i<4;i++)
            {
                System.out.println("I am Waiting 2sec");
                Thread.sleep(2000); //blocked 2sec
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("some problem");
        }
    }
}

public class mul_7 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("main thread");
        joinalive s= new joinalive();
        Thread t= new Thread(s);  //...........................New(Born State)
        System.out.println(t.isAlive()); //...................................cheack athread live or not
        t.start(); //..........................................Runnable State
        System.out.println(t.isAlive());
        // t.join();
        System.out.println("thread ending");
    }
}
/*Beforee using
main thread
thread ending ...........................
thread is a parent class state child class
I am Waiting 2sec
I am Waiting 2sec 
 */

/* After using join
-main thread
thread is a parent class state child class
I am Waiting 2sec
I am Waiting 2sec
I am Waiting 2sec
I am Waiting 2sec
thread ending                         ................*/ 

