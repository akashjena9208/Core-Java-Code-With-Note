package programmofstring;

//hello world
//op-hellO worlD
//With out useding:-    	String s2=s1+' ';
import java.util.Scanner;

public class string11_LastString_Char_UpperCase_WithoutUsigSpace {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter The Strig");
//		String s1=sc.nextLine();
//		String s2="";
//
//		for(int i=0;i<s1.length();i++) {
//			//If Given String Alredy Upper case  So condition apply
//			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
//			{
//					
//				if (i==s1.length()-1 || (s1.charAt(i)!=' '&& s1.charAt(i+1)==' '))
//				
//					s2=s2+(char)(s2.charAt(i)-32);
//				else
//					s2=s2+s1.charAt(i);	
//
//			}
//			else
//			{
//				s2=s2+s1.charAt(i);
//			}
//		}
//
//		System.out.println(s2);
//		System.out.println("-------With Out Using <s1+' '> or Without modify Given String--------");
//		sc.close();
//
//	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s1 = sc.nextLine();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            // Check if the character is a lowercase letter
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z') {
                // Check if it's the last character of the string or the last character of a word
                if (i == s1.length() - 1 || (s1.charAt(i + 1) == ' ')) {
                    s2 += (char) (s1.charAt(i) - 32); // Convert to uppercase
                } else {
                    s2 += s1.charAt(i);
                }
            } else {
                s2 += s1.charAt(i);
            }
        }

        System.out.println("Modified string: " + s2);
        System.out.println("-------With Out Using <s1+' '> or Without modify Given String--------");
        sc.close();
	}
}

