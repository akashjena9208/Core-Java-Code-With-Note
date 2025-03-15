package Loop;
/*
 * if(condition){
 * sout
 * }
 * else{
 * sout
 * }
 */
public class conditionIf {
    public static void main(String[] args) {
        int age=98;
        if(age>=18 && age<=60){
            System.out.println("You are Adult");
        }
        else if (age>=60){
            System.out.println("You are old man");
        }
        else{
            System.out.println("You are Kid");
        }

    }
    
}
