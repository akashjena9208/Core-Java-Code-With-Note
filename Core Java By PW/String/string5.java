package String;
/* Reverse string
 * case1 "Pw skill"="lliks wp"
 * case2 "pw skill"="skill pw"
 * case3 "pw java"="avaj pw"
 */

 public class string5 {
    public static void main(String[] args) {
        String str1="PWSKILL";
        String str2="";

        for(int i=str1.length()-1;i>=0;i--)
        {
           str2=str2+str1.charAt(i);
        }
        System.out.println("Before reversing :"+str1);
        System.out.println("After reversing :"+ str2);

        //case2 "pw skill"="skill pw" array 

        String S1="PWSkILL JAVA";
        String S2="";
        String arrr[]=S1.split(" "); // slit methode are used string to array

        for(int i=arrr.length-1;i>=0;i--)
        {
            S2=S2+arrr[i]+" ";
        }

        System.out.println(S2);
        System.out.println("Before reversing :"+S1);
        System.out.println("After reversing :" + S2);  



        //case3 "pw java"="avaj pw"
        String S22="PW SKILL";
        String S23="";

        for(int i=S22.length()-1;i>=0;i--){

            S23=S23+S22.charAt(i);
        }
        System.out.println("Before reversing :"+S22);
        System.out.println("After reversing :"+ S23);





    }
    
}
