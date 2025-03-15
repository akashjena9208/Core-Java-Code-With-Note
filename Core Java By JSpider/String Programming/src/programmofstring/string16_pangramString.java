package programmofstring;

import java.util.Scanner;

public class string16_pangramString {
	public static boolean isPalindrom(String str)
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
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
			{
				return false;
			}
		}
		return true;



	}
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Strig");
		String str=sc.nextLine();
		boolean result=isPalindrom(str);

		if(result==true)
		{
			System.out.println("It is Palndrom");
		}

		else
		{
			System.out.println("It is not Palndrom");
		}


	}
}
