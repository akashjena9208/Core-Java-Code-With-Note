package programmofstring;

import java.util.Arrays;
import java.util.Scanner;

//WJP To convort The String Into a Char Array WithOut using Inbulid method
public class string12_Convort_charterArray_WithoutUsing_inbulidMethod {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char[] ch=new char[s1.length()];
		
		
		//tochar array
		
		for(int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);

		}
		System.out.println(Arrays.toString(ch));
		
	}
}
