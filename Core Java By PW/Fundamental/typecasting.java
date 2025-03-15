package Fundamental;

/* TYPE  CASTING:-Changing data one from to  another  data from  that is  calleed  type  casting they are 2 types
    IMPLICIT / WIDE Type casting =it is done Automatically
    Explicit / Narrowing Type Casting = it is done maually
 * 
*/


public class typecasting {
    public static void main(String[] args) {
        int a=95;
        double b;
        // double b=a;
        b=a;
        System.out.println(b);// automatically done that is  IMPLICIT type casting

//.....................................................................................................................................
     
    double c=45.5;
        // int d= (int)c; //or
        int d;
        d=(int)c; // manualy chge used a int

        System.out.println(d);

//..............TURNCATION.............................
        int n1=15;
        int n2=2;
        float res=n1/n2;
        System.out.println(res); // int divd/divd ans  int does not matter how to store, 7.222  //.22 turn cut 
    }
    
}
