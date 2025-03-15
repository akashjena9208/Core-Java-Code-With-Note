package onedarray;

import java.util.Scanner;

public class array02_takeNcharterPrintTheFirstChar {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Size");
		int size=sc.nextInt();
		char[] ch=new char[size];
		
		for(int i=0;i<ch.length;i++)
		{
			//first char
			ch[i]=sc.next().charAt(0);
			//last char
//			ch[i]=sc.next().charAt(ch.length-1);
		}
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		sc.close();
	}
}
