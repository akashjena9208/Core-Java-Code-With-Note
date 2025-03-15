package programmofstring;

import java.util.Scanner;

//wjp to find the count of upper case charater and low case cherater and Spacall char in preasnt string
public class string03_Count_Cherater {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ether The Screen");
		String str=sc.nextLine();
		
//		String str="Wel@me T@ JSpider";
		
		int uppercaseCount=0;
		int lowercasecharter=0;
		int decimalchater=0;
		int specallchater=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				uppercaseCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				lowercasecharter++;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<'9')
			{
				decimalchater++;
			}
			else
			{
				specallchater++;
			}
		}
		System.out.println("Upper Case Count is:--> \t\t" +uppercaseCount);
		System.out.println("Lower Case Count is:--->\t\t"+lowercasecharter);
		System.out.println("Lower Case Count is:--->\t\t" +specallchater);
		sc.close();
		
	}
}
