package String;
// string- it is refers to a collection of charter which include the doobule code 
/* string is two types 1-imutabule=imutable string is not chnagable ex- String(adding time used .concat).
 mutable-  it is changable Ex- String Bullidder/Buffer (adding time .append)
 SCP:-Does not used a new keyword the value not store a heap area
 */
 public class string {
    public static void main(String[] args) {

        String name= "Akash";
        System.out.println(name);
        name.concat("jena");
        System.out.println(name);

        /* it is a imutable string the vale are not adding */



        StringBuilder Name= new StringBuilder("Akash");
        Name.append(" jena");
        System.out.println(Name);

        /* it is mutable string the value are changable */

        
    }
    
}
