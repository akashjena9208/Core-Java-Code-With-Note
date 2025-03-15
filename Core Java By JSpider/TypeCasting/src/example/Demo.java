package example;
import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		//Infinite loop
		while(true)
		{

			System.out.println("Enter Choice:");
			int choice =sc.nextInt();


			//Swich case
			switch(choice)
			{
			case 1:
				System.out.println("Hi..");
				break;
			case 2: 
				System.out.println("Bye...");
				break;
			case 3:
				System.out.println("Thank You !!!");
				System.exit(0); // Terminate the JVM/program
				// system is class //exit 0 means 
			default:
				System.out.println("Invalid Chosisse");			
			}//end of while loop
			System.out.println("----------------");
			
		}//end of main
	}//end of class

}

//Enter Choice:
//1
//Hi..
//----------------
//Enter Choice:
//2
//Bye...
//----------------
//Enter Choice:
//4
//Invalid Chosisse
//----------------
//Enter Choice:
//3
//Thank You !!!

