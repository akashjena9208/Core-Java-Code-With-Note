package programmofstring;

import java.util.Scanner;

public class string07_toStringConvortUpperCAse {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String s="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				s=s+(char)(str.charAt(i)-32);
				
			}
			else
			{
				s=s+str.charAt(i);
			}
		}
		System.out.println(s);
	}
}
