

import java.util.Scanner;

public class Metromoney {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Age");
		int age=sc.nextInt();
		
		if(age>=21)
		{
			System.out.println("You are Marrige Soon");
		}
		else
		{
			try
			{
				throw new InvalidAge(" You are Not Elgibule Marrige ");
			}
			catch(InvalidAge obj)
			{ 
//				System.out.println(" You are Not Elgibule Marrige ");
				System.out.println(obj.getMessage());
			}
		}
	}

}
