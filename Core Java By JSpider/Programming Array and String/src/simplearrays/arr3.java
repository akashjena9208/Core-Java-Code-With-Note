package simplearrays;

import java.util.Scanner;

////write java program to take names from the user and print them alnog with index
public class arr3 
{
	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter The Name");
		String[] s=new String[5];
		
		//to take names from the user dynamic
		for(int i=0;i<s.length;i++) {
			s[i]=sc.nextLine();
//			System.out.println("Index Number :---> "+i+" Name of The Student :---> "+s[i]+ "Length of :---->"+s[i].length());
			
		}
		
		for(int j=0;j<s.length;j++)
		{
//			System.out.println(s[j]);
//			System.out.println(j);
			System.out.println("Index the number:-> "+j+" Value"+s[j]);
		}
		
		
	}

}


