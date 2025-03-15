package programmofstring;

import java.util.Scanner;

public class string05_PalindromOrNot_WithoutInbuit_Method {
	public static void main(String[] args) {
//		String S1="MALAALAM";
		
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enther the Value");
		String S1=sc.nextLine();
		
		//i take two pointer
		int i=0;
		int j=S1.length()-1;
		boolean flag=true;
		
		while(i<=j)
		{
			if(S1.charAt(i)==S1.charAt(j))
			{
				i++;
				j--;
				
			}
			else {
				flag=false;
				break;
			}
		}
		
		if(flag==true)
		{
			System.out.println("it is palindrom String");
		}
		else
		{
			System.out.println("it is not palindrom String");
		}
		
		
	}
}

