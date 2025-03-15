/* == operator is a compare to  refrence  of object // adress cheak
 * equal() is contain of two object //compare the value
 */

package String;
 public class string2 {
    public static void main(String[] args) {

        String S1= "Akash";
        String S2= new String("Akash");

        System.out.println(S1==S2);
         //cheack adress Ans False
        System.out.println(S1.equals(S2));
        //cheack value Ans true


        
    }
    
}
