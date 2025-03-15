package String;
/*Immutable string  write a 2 types 
 * String varname="pw"   Value are store are SCP& DUPPLICATED  VALUE ARE NOT ALLOWED 
 * String varname=new String("pw") the vale direct store Heap area  &  DUPPLICATE VAULE ARE ALLOWED
 */

 public class string1 {
    public static void main(String[] args) {
        String S1= "akash";
        String S2="akash";

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S1==S2);
        // value are store  string console area  & Both vaule name are   dupicate vaule are not allow.fso store a one place.
        //(s1==s2)true bcz dupicate are not allow SCP


        String S3= new String("Subha");
        String S4= new String("Subha");
        System.out.println(S3==S4);
        //the vale direct store Heap area  &  DUPPLICATE VAULE ARE ALLOWED
        //(S3==S4) false store a heap area





    }

   
}
