package onedarray;

import java.util.Scanner;

public class array03_StringFirstCharPrint {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Size");
		int size=sc.nextInt();
		System.out.println("Enter the Elemnt");
		String []str= new String[size];

		for(int i=0;i<str.length;i++)
		{
			str[i]=sc.next();
		}
		System.out.println("Print First Char");
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i].charAt(0));
		}

	}

}
