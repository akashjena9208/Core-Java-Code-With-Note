package MultiTheding;
/*Different states of Thread
A thread is a path of execution in a program that goes through the following states of a
thread. The five states are as follows:
1. New(Born State):
- When  creat object that state is a new or born

2. Runnable:
- ready to be execitued
- whwen the call the statrt methode ready to Started 
- thread scudelar ke pass register ho jayaga

3. Running
- thread scudelar schudel the task inside the run methode 

4. Blocked (Non-runnable state)
- some issue like require resources unavilable  like sleep,wait(),susupend()
5. Dead
-all task complet then end the task */
class state implements Runnable
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

public class mul_6 
{
    public static void main(String[] args) 
    {
        state s= new state();
        Thread t= new Thread(s);  //...........................New(Born State)
        t.start(); //..........................................Runnable State
    }
}
