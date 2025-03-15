package MultiTheding;
/*
 * Interaputed :-Running time/Running state You Can not used Interputed
 *              - wating/sleep/block Time used Interput
 */
class intrepeerter implements Runnable
{
    public void run()
    {
        try 
        {
        for(int i=0;i<3;i++)
        {
            System.out.println("i am coder");
            Thread.sleep(2000);
        }
    }
    catch(Exception e)
    {
        System.out.println("Thread is interpretur");
    }
    }
}


public class mul_8 
{
    public static void main(String[] args) 
    {
        intrepeerter imp =new intrepeerter();
        Thread obj=new Thread(imp);
        obj.start();
        obj.interrupt();
    }
    
}