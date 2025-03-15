package programmofstring;

import java.util.Scanner;

public class string08_Count_Vowel_Conssunet {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");	//String Shhould be String
		String str=sc.nextLine();
		
		int vc=0;
		int cc=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z' )
			{
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				{
					vc++;
				}
				else {
					cc++;
				}
			}
		
		}
		
		System.out.println("Vowel Count :--> "+vc);
		System.out.println("Consunet Count :--> "+cc);
		
	}
}
