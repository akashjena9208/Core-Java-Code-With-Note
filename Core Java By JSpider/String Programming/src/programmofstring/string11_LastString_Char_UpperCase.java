package programmofstring;

import java.util.Scanner;
//Using-String s2=s1+' ';
public class string11_LastString_Char_UpperCase {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Strig");
			String s1=sc.nextLine();
			//hello world
			//op-hellO worlD
			String s2=s1+' ';
			String s3=" ";
			
			for(int i=0;i<s2.length();i++) {
				
				if (s2.charAt(i)!=' ' && s2.charAt(i+1)==' ')
				{
					s3=s3+(char)(s2.charAt(i)-32);
					
				}
				else
				{
					s3=s3+s2.charAt(i);
				}
				
			}
			
			System.out.println(s3);
			
			sc.close();
			
		}
}
