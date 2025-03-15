package programmofstring;

import java.util.Scanner;

public class string05_PalindromOrNot {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The String Value");
		String s1=sc.nextLine();
		String s2="";

		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}

		if (s1.equals(s2))
		{
			System.out.println("Given String is  Palindrom");
		}
		else
		{
			System.out.println(" Given String is Not Palindrom");
		}

		sc.close();
	}
}
