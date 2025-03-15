package programmofstring;

import java.util.Scanner;

//A-65 ......Z=90
//diffrence b/w A-a=32
//a=97.....z=

//wrjp to convort all the charter to string to lower case
public class string06_char_convort_uppercase {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String s="";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				s=s+(char)(str.charAt(i)+32);
				
			}
			else
			{
				s=s+str.charAt(i);
			}
		}
		System.out.println(s);
		
		
	}
}
//wjp to find the count of vowels and consunet presant inthe string