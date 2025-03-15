package exe;

import java.util.Scanner;

public class Simple 
{
	public static void main(String[] args) {
		System.out.println("Programme Stratred");
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try
		{
			int res=a/b;
			System.out.println(res);
		}
		catch (Exception e) {
			System.out.println("dont devid by zero");
		}
		
		System.out.println("Qouents has brrb found");
		System.out.println("Programme EndS");
	}

}
