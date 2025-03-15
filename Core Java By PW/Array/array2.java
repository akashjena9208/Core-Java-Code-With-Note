// package Array;
public class array2 {
    public static void main(String[] args) {
        int num [][]= new int[3][2];
 
        num[0][0]=5;
        num[0][1]=15;
        num[1][0]=25;
        num[1][1]=35;
        num[2][0]=45;
        num[2][1]=55;
 
        for(int i=0;i<3;i++)
        {
         for(int j=0;j<2;j++)
         {
             System.out.print(num[i][j] + " ");
         }
         System.out.println();
        }
 
     }
    
}
