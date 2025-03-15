/*Anagram -one word arrangement a new word that is called New keyword example- keep=peek. when cherater avilable  that chareter  used make a new word  that is so  
 * ex- school master =the class room
 * 5 step
 * step 1- remove space
 * step 2- convert upper/lower case
 *step 3-cconort to array
 * step 4-convort A=65,b=66.....
 * step 5-comapre array sort
 * 
*/
package String;
import java.util.Arrays;

public class string7anagram
{
    public static void main(String[] args) 
    {
        String str1="School Master";
        String str2="The Classroom Java";

        // String str1="keep";
        // String str2="peek";

        // str1=str1.replace(" ", "");
        // str2=str2.replace(" ", "");


        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        char []ar1=str1.toCharArray();
        char []ar2=str2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if(Arrays.equals(ar1, ar2))
        {
            System.out.println("It's an Anagram");
        }
        else 
        {
            System.out.println("Its not an Anagram");
        }
    }
    
}





