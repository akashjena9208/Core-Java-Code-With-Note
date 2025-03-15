package programmofstring;

import java.util.Scanner;

public class string08_Count_Vowel_Conssunet_both {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String ");	//both lower and upper count
		String str=sc.nextLine();

		int vc=0;
		int cc=0;

		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z') )
			{
				if((str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')//..lower case
						||
						(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'))//..uper caase 
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
