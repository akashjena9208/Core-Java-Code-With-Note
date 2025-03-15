package programmofstring;


import java.util.Scanner;

//wjp to given program are Angram or not
//example:- gental man,abcda
//o/p-  elegant man,dabca

public class string19_Angram {
	public static int[] countFrq(String str)
	{
		int[]  count=new int[26];
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>'A' && ch<='Z')
			{
				count[ch-65]++;
				
			}
			else if(ch>='a' && ch<='z')
			{
				count[ch-97]++;
			}
		}
		return count;	
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Strig");
		String str=sc.nextLine();
		System.out.println("Enter The Strig");
		String str1=sc.nextLine();
	}

}
