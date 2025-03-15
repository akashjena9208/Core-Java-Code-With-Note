package Fundamental;
/*operator in java:-operator in java 6 types
 * 1- Arithmatic operator
 * 2-Relation Operator
 * 3-Logical Operator
 * 4-Assinment Operator
 * 5-Unay Operator
 * 6-Bitwise Operator
 */
public class operator {
    public static void main(String[] args) {
        int n1=200;
        int n2=100;
        //Arithmatic operator
        System.out.println(n1+n2); //+ Addition

        System.out.println(n1-n2); //- Subtraction

        System.out.println(n1*n2); //* Multiplication

        System.out.println(n1/n2); //  / Division

        System.out.print(10 % 2);  // % Modulus        reminder=0

        System.out.println(5 % 10); //Divides left hand operand by right operand and returns remainder which one is big

        System.out.println(n1++); //(++ Increment)   Increases the value of operand by 1
      
        System.out.println(n2--); //(-- Decrement)   Decreases the value of operand by 1
//.................INCRIMENT & DECRIMENT.............................................................................................
 /*
 Post incriment :- 1st value used then incrsed
 pre  incriment :-1st incsed then value  used

 
    1-Post incrimment  varibale++ 
    2-Pre incriment    ++Vbaribale
    3-PostDecriment varibale--
    4-Predecriment --varible
  */    

  int a=5;
  int c=a++;
  int d=++a;
  int e=a--;
  int f=--a;
  System.out.println(c);//5  1st value used then incrsed
  System.out.println(d);//7  incriment 1st then value incresed
  System.out.println(e);//7
  System.out.println(f);//5



        
    }
    
}
