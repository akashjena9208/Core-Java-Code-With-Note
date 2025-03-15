package Loop;

public class ternary {
    // (condition)? T:F; //T=if,F=else

    public static void main(String[] args) {
        
        int a=30;
        int b=20;

        int res=(a<b) ? a: b;
        System.out.println(res);

      String res1= (a<b) ? "a is less": "b is less";
        System.out.println(res1);

        int c=40;
        int num =(a<b)?(a<c?a:b):(b<c?b:c);
        System.out.println(num);
      
        
        
    }
    
}
