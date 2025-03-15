package String;
/* Concation - Adding two object  these are two type "+" String.concat()
 * .concat is a one value adding 
 * + is a multipule value adding
 */
public class string3 {
    public static void main(String[] args) {
        String S1= new String("Akash ");
                S1.concat("JENA"); // AKASH JENA NOT ADD Imutubale string are not changable BUT S1 CREAT HEAP AREA AND COPY SCP 
                System.out.println(S1);

           S1= S1.concat("Jena"); // // AKASH JENA  ADD IN THIS CASE. Imutubale string are not changable BUT INTHIS CAASE S1 NEW STRING ARE STORE ABODER VALUE
            System.out.println(S1);

        

// .concat
    String S2= "pw java "; // NOT USED "new" KEY WORD SO STORE SCP
    String S3=S2.concat("Skill");//right side used refrence or inbuild methode used  store/allowcoetd a heap area. anoter copy store SCP
    /*inbulid  used  Store out side the the SCP  so add  //op=pw java skill */
    // pw java skill are not add o/p-pw bcz it is simple string  imutubale string are not changable? but it also creat BCZ WE UED INBULID METHODE OR REFRENCE
    String S4= new String("pw DSA ");
        S4=S4.concat("Skill");/*new key word used so add */
    // pw java skill are add bcz new keyword are used so imutubale string rae not change but exrea add a skill  
    System.out.println(S2);
    System.out.println(S3);
    System.out.println(S4);


    // + operator
    String S5="Aka";
    String S6="Aka"+"sh ";
    String S7="Aka"+"sh "+"Jena";
    String S9=S6+S7;    /*refrence varibale used (S6 and s7) so add  */
    

    System.out.println(S5);
    System.out.println(S6);
    System.out.println(S7);
    System.out.println(S9);

// + operator are adding 
 String S99="COURSE";
 String S10= "Course"+20+24;

    //    S10= S10.concat(99);/* not add */

    System.out.println(S99);
    System.out.println(S10);


    }
    
}
