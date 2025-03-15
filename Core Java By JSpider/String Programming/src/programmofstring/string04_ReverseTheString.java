package programmofstring;
//To reverse the Given String
import java.util.Scanner;
public class string04_ReverseTheString {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String Value");
		String str=sc.nextLine();
		
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			System.out.println(str.charAt(i));
//		}
//		System.out.println("------");
		
		
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		System.out.println("Revesre String :----> "+s);
	}
}
