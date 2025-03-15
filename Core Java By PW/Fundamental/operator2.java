package Fundamental;

public class operator2 {
    public static void main(String[] args) {
        //Assinment opperator(=)
        /* int m1;
        int m2;
        int m3;
        int m4; */
        //OR//
        int m1,m2,m3,m4; //if data type are same
        m1=m2=m3=m4=10;
        System.out.println(m1+" "+m2+" " +m3+" "+m4);
       //compund Assignment
       int Z=10;
        Z+=5; //(Z=Z+5;)
         System.out.println(Z);


 //....................RELATION..............................................................
 /*==, <, >, <=, >=,!= */
        int a=10;
        int b=10;
        int c=20;

        boolean res= a==b; //return  a boolean value
        boolean res1= a!=c;

        System.out.println(res);
        System.out.println(res1);




    //................Logical...........................................................................................//
        //Logical And=&&   all True then True other wise falshe (T T=T)
        //lOgical Or=||    all falshe then falshe other wise TRUE (F F=F)
        //LOgical Not=!     TRUE =FALSHE ,F=T (OPSITE)
        int a1=10;
        int a2=20;
        int a3=30;
        System.out.println(a1<a2 && a2<a3); //&&    T T=T
        System.out.println(a1==a2||a3==a2); //||    F F=F
        
        
    }
    
}
