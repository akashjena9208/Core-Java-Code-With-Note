package API;

 /*enum is a constant not declear public,final,varibale,
  * - you can not craeat a object
  - you declear inside the class & out side the class 
  - upper case 7 lower case both side right

  */
 
//enum -- 1.5 

//out side the class
enum Week
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class  eni_1 
{
    //inside the class
    enum Result
    {
        PASS, FAIL, NR;
    }
    
    public static void main(String[] args) 
    {
        // data type week
        Week w=Week.MON;
        System.out.println(w);

        Result r= Result.PASS;
        System.out.println(r);

        //index cheack call the ordinal()
        int index =Week.FRI.ordinal();
        System.out.println(index);
    
        // ALL VALUE GET  USED values():- all constant key value 
       Week []wr=Week.values();

       //itreartion
       for(Week w1: wr)
       {
        System.out.println(w1 + " : " + w1.ordinal());

       }

        // Result r=Result.PASS;
        // System.out.println(r);
        
    }
    
}

    

