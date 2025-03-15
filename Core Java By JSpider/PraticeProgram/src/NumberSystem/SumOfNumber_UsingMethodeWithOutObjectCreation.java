package NumberSystem;

import java.util.Scanner;



public class SumOfNumber_UsingMethodeWithOutObjectCreation 
{
	static int add(int n)
	{
		int sum=0;
		
//...........................Using For Loop.......................................................................................
		
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;

//	....................Useding While............................................................................
//		int i=0;
//		while(i<=n)
//		{
//			sum=sum+i;
//			i++;
//		}
//		
		
//.............................Useding Do While......................................................................................
		
//		int i=0;
//		do {
//			sum=sum+i;
//				i++;
//		} while (i<=n);
//		
//		
//		return sum;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		
		int ans=add(num);
		System.out.println(ans);
		
		sc.close();
		
	}
}
