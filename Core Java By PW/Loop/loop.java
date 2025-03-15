package Loop;
/* Loop:-Same Activity have a multipule time used loop 
 *  work:-     1-iniization :2-condition : 4-update;
 *              3- body cheaked 
 * 
 * 
 * 
 *  3 types of different loop
 * 1)For loop:-for(1-iniization :2-condition : 4-update;)
 *            { 
 *                   3- body cheaked 
 *              }
 *              
 *  
 * 2)while loop:- 1st time condition wrong not exicuted
 *      inilization
 *      while(condition)
 *       {
 *          body
 *          update
 *       }
 *  
 * 
 * 
 * 3)do while loop :-first value are exeutrd then  that is  repet    
 *   intiized
 *      do
 *      {
 *          body
 *          upadte
 *      }  
 *      while (condition)
*/  
public class loop{
    public static void main(String[] args) {
        //for loop
        for(int i=0;i<5;i++)
        {
            System.out.println("*");
        }

        //while
        int a=0;
        while(a<5)
        {
            System.out.println("it  is a while loop");
            a++;
        }

        //do while
        int j=0;
        do{
            System.out.println("A");
            j++;
        }
         while(j<5);



    }
 }
