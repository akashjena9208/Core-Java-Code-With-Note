package simplearrays;
//write java program to find factorial each element 
import java.util.Scanner;

public class arr7 
{
	static int isfactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;	
	}
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Size");
		int size=scanner.nextInt();
		int ar[]=new int[size];	
		System.out.println("enter the array elements");	
//		int ar[]= {1,2,3,4,5};
		
		//to take dynamic value from user
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scanner.nextInt();		
		}
		System.out.println("----------------------");
		for(int i=0;i<ar.length;i++)
		{
			int res=isfactorial(ar[i]);		
			System.out.println(ar[i]+"-------------->"+res);
		}

		scanner.close();
	}

}
