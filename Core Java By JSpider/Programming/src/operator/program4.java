package operator;

import java.util.Scanner;

//wjp to cheak the given value 2 digt number or not
public class program4 
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a=scanner.nextInt();
		
		System.out.println((a>9 && a<100) ||(a<-9 && a>-100) ? "Two digit number "+a:"not two dight number "+a );
		
		scanner.close();
	}
	
}
// write java progrm to take 3 number from user and find the largest among them
