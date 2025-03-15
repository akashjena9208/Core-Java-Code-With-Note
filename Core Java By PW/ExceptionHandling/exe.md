1- types of error
- Syntax error:-it is gramitical error,it is a  mistke of a code structer
- logical error:-Syntax are correct but output are different
- Run time Error:- runtime get issue
            -A runtime error is an error that occurs when a program you're using or writing crashes or produces a wrong output.

Q-Explain differena types of Errors in java.
Ans:In any programming language ge categoride errord into 2 types
   Syntax Error/CompileTime Mistake
`  Logical Error/RunTimeMistakes

Syntax error/CompileTime Mistake
 It referd to the mistake done by the programmer with respect to syntax
 These mistakes are identified by the compiler, so we say it as “CompileTimeMidtake”.

Logical Error/RunTime  mistake
 It referd to the mistaked done by the programmer in terms odf writting a logic
 Thede midtake  are identified by jvm during the execution of a program, so we say it as “RunTimeMidtake”.


2-Exception handiling
- Exception is runtime error
- in java Execprtion is a class ,class  Creat a Object  
                -Normal
                - Critical 
example :-
public class exe_1 
{
    public static void main(String[] args)
    {
        //normal
        int num1=6;
        int num2=0;
        // int num2=2;
        int res=0;
        
        try
        {
            //critical
           res= num1/num2;
           System.out.println("Any Exception Dirctly Jump Catche");
        }
                //object creat
        catch(ArithmeticException A) // handel the exception
        {
            System.out.println("Somthing went to Wrong"+A);
        }

        System.out.println(res);
        System.out.println("Execption Handel");
        
    }
}

 Q- What is an Excepaion in Java .
Ans: An unganted/expected event that didturbd the normal flog of execution of a program id called "Exception
handling"
 The main objective of Exception handling id to handle the exception
 It id available for graceful termination of program.


 3 - Try multipuel Catch:- Try block multipule critical Section
                            one try class multipue catche.

    example:- try
    {
        //res=a/b;
        res= a/name.length(); //error // null point exception
        System.out.println(arr[5]); //error
    }

    catch(ArithmeticException e)
    {
        System.out.println("can not devid by  zero"+e);
    }

    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(arr[arr.length-1]);
        System.out.println("Stay your limit");
        
    }

    catch(Exception e)
    {
        System.out.println("somthing went to wrong"+e);
    }







