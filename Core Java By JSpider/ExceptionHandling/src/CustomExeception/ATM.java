package CustomExeception;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int balance=10000;
		 
		 
		 System.out.println("Enter the Amount");
		 int amount=sc.nextInt();
		 
		 
		 if(amount<=balance)
		 {
			 System.out.println("Witdraw sucessfull");
		 }
		 else
		 {
			 try
			 {
				 throw new InsufficientBalance();
			 }
			 catch (InsufficientBalance e) {
				System.out.println("Not Enfough Balance");
			}
		 }
	}

}
