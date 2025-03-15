1-Static key word :- it  is mainly used memory mangement.
 -it is applied with varibale, block, function,class
 -Static is non acess modifer.

                                                      
why static key word used?

- when ever common copy of data which have to share among all the object & classes then you go static varibales bcz during class loading itself memory will be allowcoted  heap area and same copy of data will used for all the object & memory allowcated only ones so it is effecences.




2-HOw to java  programm exicutted Jvm exuted .

 .class file you send JVM  (JVm get the Byte code)>> Jvm  Loading all file >>Execution engin.

    JVM loading file :-{  [methode area] [Heap] [Java Stack] [pc register] [NAtive area ] } // Run time data

           { -Object file and Instance Varibale  Store Heap area.
             -Methode  & local varibale Store a Stack }    //JVM store properly then executed 


3- JAVA is a Compile & Interpeted 

        Compile :- At time all are exicutted  ex-C

        Interpeted :- line by line exucuted  Example- Javascript

.......................................................Run Time..................................................................

4-class LOading:-  it is 3 process a) Loading
                            b) Linking  {1-verify>>Prepare>>Rsolve}
                            c) intialization {1- Static Variable
                                                                -Static used creat a memory that memory  is a Heap & one time
                                                                - Static memory object independent ex-static2 }


................ Exicution  Time......................................................

1-1st Exicuted  Static Variable.
2-2nd Exicuted  Static Block.
3-3rd Exicuted  Static Methode.
4-4th Exicuted  Static Variable.
5-5th Exicuted  Non Static Block.
6-6th Exicuted  Non Static Methode.

.........................................................
-java rule you call the methode  you crate object  and calling the object using refrence you mad . only one case you can not creat a object this case is using " static " key word
Example /*
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


                   



 */




    



              