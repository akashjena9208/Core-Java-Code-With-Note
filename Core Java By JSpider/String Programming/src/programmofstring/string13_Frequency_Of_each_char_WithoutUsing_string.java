package programmofstring;

import java.util.Scanner;

public class string13_Frequency_Of_each_char_WithoutUsing_string {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
		
			System.out.println("Write a Given String...?");
			String str=sc.nextLine();
//			String str="ABCDEFGHIJ";
			
			//intger array
			int[] count = new int[26];

			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch>='A' && ch<='Z')		
					count[ch-65]++;
			}	
			//printig
			for(int i=0;i<count.length;i++)
			{
				if(count[i]!=0)
				System.out.println((char)(i+65)+"---->"+count[i]);
			}
			
			sc.close();
			
		}
}
//Wjp To comapre to string without using equal method