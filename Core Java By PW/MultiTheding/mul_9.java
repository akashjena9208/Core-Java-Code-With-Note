package MultiTheding;
/*
 * Synchronize:- one resorreces that resorces multipule thread to Exicuted at a time so  that time used syncronized 
 * -Synchronization in Java is the process that allows only one thread at a particular time to complete a given task entirely.
 *  it is used a Methode(At a time one thread exucted particular resorce)
 * -block(mutipile a thread at time not executed)
 */
class car1 implements Runnable
{
    synchronized public void run()
    {
        try 
        {
            System.out.println(Thread.currentThread().getName()+" Has entered the parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Got into car to drive");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Came back and parked the car");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Some problem");
        }
    }
}
public class mul_9 
{
    public static void main(String[] args) 
    {
        car1 c= new car1();
        Thread t1=new Thread(c);
        Thread t2=new Thread(c);
        Thread t3=new Thread(c);

        t1.setName("Son-1");
        t2.setName("Son-2");
        t3.setName("Son-3");
        
        t1.start();
        t2.start();
        t3.start();


    }
}
