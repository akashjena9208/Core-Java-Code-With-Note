package MultiTheding;
/*How to create Threads
There are two ways to create a thread:-
1. By extending Thread class
2. By implementing Runnable interface

-you not creat a strat methode but exicuted a stared methode bcz Mythread extend the  to thread
-Start() you call all thread exicuted 
- you call the run() only run methode exuiced it is singe thread

Thread Scheduler
-thread Scheduler Assitence of Jvm
_Thread Schedular Mange all thread , you creat thread  or main thread creat , mange a hread Schedular
● If multiple threads are waiting to execute,then which thread will execute 1st is decided
by Thread Scheduler which is part of JVM.
● In the case of MultiThreading we can't predict the exact output, only possible output we
can expect.

*/
class MyThread  extends Thread //By extending Thread class
// all inbulit thread methode inherit a Mythread class
{
    // define a run methode 
    public void run()
    {
        System.out.println("child Thread");
    }
}
public class mul_3 
{
    public static void main(String[] args) 
    {
        MyThread t=new MyThread();
        t.start();
       
    }
}
