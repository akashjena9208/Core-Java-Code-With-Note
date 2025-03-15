package CustomExeception;

import java.util.Scanner;

public class Metromoney {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Age:- ");
		int age=sc.nextInt();
		
		if(age>=21)
		{
			System.out.println("Get marrige Soon!!!");
		}
		else
		{
			try
			{
				throw new AgeInvalidExecption("Have Patience ,You are not yet");
			}
			catch(AgeInvalidExecption obj)
			{
				System.out.println(obj.getMessage());
			}
		}
	}
}
