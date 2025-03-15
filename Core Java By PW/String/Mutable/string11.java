package String.Mutable;
public class string11 {

    public static void main(String[] args) {
        //immutable string
        String S1=new String("King");
        S1=S1.concat(" Kohli");  // adding time used .concat
        // change bcz used new key word  // S1=King** no object s1 reffernce a S, S1=VK
        System.out.println(S1);
    
        // mutable String
        StringBuffer sb=new StringBuffer("Virat");
        sb.append(" Kohli");// adding time used append
        System.out.println(sb);
        sb=new StringBuffer("Sachin");// obj reffer sachin  sb=vk**  sb=sachin
        System.out.println(sb);
    //..........................................
    // used a final key word
       final StringBuffer sb1=new StringBuffer("Virat");
        sb.append(" Kohli");// adding time used append
        System.out.println(sb1);
        // sb1=new StringBuffer("Sachin");// obj reffer sachin  sb=vk**  sb=sachin
        // System.out.println(sb1);   /*Error bz used final key word  sb not refer a another object */
    
    
    /* Final key word used the impact refrence varibale of a "sb"
     * buut Those refrence varibale does not reffr other object
     * final does not effect mutable inmuttable
     */
    
        
    
    }
        
    }
    
