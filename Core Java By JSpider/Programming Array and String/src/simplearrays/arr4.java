package simplearrays;
//wrjp to take firstname of student has i/p from the user and print only first char in the given name

import java.util.Scanner;

///wrjp to take n charater i/p from the user & print them
public class arr4 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		
		
		char [] ch=new char[size];
		//to take dynamic data from user
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("-------------------------------------------------");
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
