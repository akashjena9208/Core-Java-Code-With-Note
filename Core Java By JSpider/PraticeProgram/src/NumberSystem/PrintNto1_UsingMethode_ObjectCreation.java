package NumberSystem;

import java.util.Scanner;

public class PrintNto1_UsingMethode_ObjectCreation 
{
	public void reverse(int n)
	{
//		for(int i=n;i>=1;i--)
//		{
//			System.out.println(i);
//		}
		
//		
//		int i=n;
//		while(i>0)
//		{
//			System.out.println(i);
//			i--;
//		}
		
		
		int i=n;
		do
		{
			System.out.println(i);
			i--;
		}
		while(i>=1);
	}
	
	
	public static void main(String[] args) 
	{
		PrintNto1_UsingMethode_ObjectCreation p = new PrintNto1_UsingMethode_ObjectCreation();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Plz Enter A Number");
		int x=scanner.nextInt();
		
		p.reverse(x);
		
		scanner.close();
		
	}

}
