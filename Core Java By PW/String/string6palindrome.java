package String;

/* PALINDROME:- BOth  RIGHT TO LEFT LEFT RIGHT(FORWARD & REVERSE) VALUE ARE SAME THAT IS SO  EXAMPLE MADAM,2552*/
public class string6palindrome {

    public static void main(String[] args) {
        String S1="MADAM";
        String S2="";

        for (int i=S1.length()-1;i>=0;i--)
        {
            S2= S2 +S1.charAt(i);
        }
        System.out.println(S1);

        System.out.println(S2);

        if (S1.equals(S2)){     /* VALUE CHEAKED */
             System.out.println("it is a palindrome");
        }
        else{
            System.out.println("it is not  a palindrome");
        }
//.......................................................................................................................................
        if (S1==S2){
            System.out.println("it is a palindrome"); /* aDRESS CHEKED */
       }
       else{
           System.out.println("it is not  a palindrome");
       }


    }
    
}
