package String;
/*Pangram - all alphabat are involed A to Z
 * step1- remove white space
 * step 2-convort either upper case or lower case if it is not
 */

 public class string8pangram {
    public static void main(String[] args) {
        String str="THE QUICK BROWN FOX JUMPS OVER LAZY DOGS";
        str=str.replace(" ", "");
        str=str.toLowerCase();
        char ch[]=str.toCharArray();//string  to convort charater array

        int ar[]=new int[26];//alphabat  storage so 26
        
        for(int i=0;i<ch.length;i++){
            ar[ch[i]-97]++; // ascii value a=97,A=65
        }
        for(int i=0;i<ar.length;i++)
        {
            if (ar[i]==0){
                System.out.println("it is not a panogram");
            }
            
        }
        System.out.println("it is a panogram");
    }
    
}

