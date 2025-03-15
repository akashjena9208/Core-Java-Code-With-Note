package programmofstring;

import java.util.Scanner;

public class string08_Count_Vowel_Conssunet_uppercase {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");	//String Shhould be upeer
		String str=sc.nextLine();
		
		int vc=0;
		int cc=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' )
			{
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
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
