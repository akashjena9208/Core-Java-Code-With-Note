package String.Mutable;
/*MUTABLE STRING- It is a changable ,onc e we creat a string if we try to a operarion & if those change  get  a reflect same object those are callwd so..  
 these are two types used  StringBuffer & StringBulider
1-StringBuffer-used a .append for adding & new key word
2-StringBulider-used a .append for adding & new key word
*/ 

public class string10 {
    public static void main(String[] args) {
        StringBuffer obj=new StringBuffer("Virat");
        // StringBuffer sb=""; this case invalid
        obj.append(" Kohli");
        {
            System.out.println(obj);
        }

        
    }
    
}
