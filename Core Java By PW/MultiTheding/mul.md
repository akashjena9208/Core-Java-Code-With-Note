1- mutlti Tasking
- Many task at time thta is so. or
- Executing Several Task Simultaniosly Is the concept of multi tasking
it is two types  -Process Base 
                -Thred Base

a) Process base Muti tasking
  - Multipule task  at a time , one time you do inst scroll , Wp chat..... etc
  -Executing A several Work/task Simultanioues Whear each task is seperat independent process Suach as.

b) Thred Base Multi tasking 
 - Executing A Several task Simulatious Where each tasknis Seprated & independent part Of the Same Program  is so.
 -  Each independent Part is called thread .

Q-What do you mean by Multithreading? Why is it important?
Ans: Multithreading means multiple threads and is considered one of the most important features of Java. As the name suggests, it is the ability of a CPU to execute multiple threads independently at the same time but share the process resources simultaneously. Its main purpose is to provide simultaneous execution of multiple threads to utilize the CPU time as much as possible. It is a Java feature where one can subdivide the specific program into two or more threads to make the execution of the program fast and easy.


Q-What are the benefits of using Multithreading?
Ans:-There are various benefits of multithreading as given below:
- Allow the program to run continuously even if a part of it is blocked.
- Improve performance as compared to traditional parallel programs that use multiple processes.
- Allows to write effective programs that utilize maximum CPU time
- Improves the responsiveness of complex applications or programs.
- Increase use of CPU resources and reduce costs of maintenance.
- Saves time and parallelism tasks.
- If an exception occurs in a single thread, it will not affect other threads as threads are independent.
- Less resource-intensive than executing multiple processes at the same time.

Q3- What is Thread in Java?
Ans: Threads are basically the lightweight and smallest unit of processing that can be managed independently by a scheduler. Threads are referred to as parts of a process that simply let a program execute efficiently with other parts or threads of the process at the same time. Using threads, one can perform complicated tasks in the easiest way. It is considered the simplest way to take advantage of multiple CPUs available in a machine. They share the common address space and are independent of each other.

2-How to create Threads
There are two ways to create a thread:-
1. By extending Thread class
2. By implementing Runnable interface

-you not creat a strat methode but exicuted a stared methode bcz Mythread extend the  to thread
-Start() you call all thread exicuted 
- you call the run() only run methode exuiced it is singe thread

3-Thread Scheduler
- thread Scheduler Assitence of Jvm
- Thread Schedular Mange all thread , you creat thread  or main thread creat , mange a hread Schedular
● If multiple threads are waiting to execute,then which thread will execute 1st is decided
by Thread Scheduler which is part of JVM.
● In the case of MultiThreading we can't predict the exact output, only possible output we
can expect.

4-run() method :-
The run() method is available in the thread class constructed using a separate Runnable
object. Otherwise, this method does nothing and returns. We can call the run() method
multiple times.

The run() method can be called in two ways which are as follows:
1. Using the start() method.
2. Using the run() method itself.

5- Diff b/w start() and run()
● If we call start() and seperate thread will be created which is responsible to execute the
run() method.
● If we call run(), no separate thread will be created, rather the method will be called just
like a normal method by main thread.

6-Importance of Thread class start()  method
● For every thread, required mandatory activities like registering the thread with Thread
Scheduler will be taken care by Thread class
● start() method and the programmer is responsible for just doing the job of the Thread
inside run() method.
● start() acts like an assistance to programmers.
● start()
{
register thread with ThreadScheduler
All other mandatory low level activities
invoke or call the run() method.
}
● We can conclude that without executing the Thread class start() method there is no
chance of starting a new Thread in java.
● Due to this, start() is considered the heart of MultiThreading.

7-Different states of Thread
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
-all task complet then end the task

8- join & is Alive
Join:-Java allows one thread to wait until another thread completes its execution.
  isAlive:-We can determine if a thread is currently alive or not by calling a Thread instance's isAlive() method

Diff b/w byextending runable impliment

 byextending:-
 - class extend thread 
 - creat run methode
- creat of object of(child) class(bcz parent is thread thread relationship child class)
- Resused not possible 

By implent Runabble
- class impliment 
- creat a run methode
- creat of a object child class
- create of object of thread
- constractor pass child class object
- bcz no relation of class Thread so you pass
- it is best another  class
 scope
 -your another class request extend and impliment 
 - reused possibule 

8-synchronized keyword
- one resorces multipule thread  are exicuted a that time used a synchronized keyword
 - it ids usd a block and methode
 
● synchronized keyword is used to make the class or method thread-safe which means
only one thread can have lock of synchronized method and use it, other threads have
to wait till the lock releases and anyone of them acquire that lock.

● It is important to use if our program is running in multi-threaded environment where
two or more threads execute simultaneously. But sometimes it also causes a problem
which is called Deadlock.

9-Deadlock
Deadlock is a situation where a set of processes are blocked because each process is
holding a resource and waiting for another resource acquired by some other process.






