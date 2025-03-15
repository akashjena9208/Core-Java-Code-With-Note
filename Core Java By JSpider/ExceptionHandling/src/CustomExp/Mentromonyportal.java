package CustomExp;

import java.util.Scanner;

public class Mentromonyportal {
	
	static void Validage(int age) throws InvalidAgeException
	{
		if(age>21)
		{
			System.out.println("Get Marrid Soonn pls!!!");
		}
		else
		{
			throw new InvalidAgeException("Invalide age After some Year ");
		}
	}

	
	public static void main(String[] args) {
		System.out.println("Programm Startted.....");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
	
		try
		{
			Validage(age);
		}
		catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("endd.......");
		sc.close();
	
	}
}
