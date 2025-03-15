package NumberProblem;

import java.util.Scanner;

//3121 first digit,last digit== (sum of digit  same)== except first digit,last digit ex-31211 3+1=4,1+2+1=4
public class Xylem_Phloem_Number 
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Number");
		int XP=scanner.nextInt();
		int InerSum=0;
		int OuterSum=0;
		OuterSum=XP%10;
		XP=XP/10;


		while(XP>9)
		{
			int digit=XP%10;

			InerSum=InerSum+digit;
			XP=XP/10;
		}
		
		OuterSum=OuterSum+XP;

		if(OuterSum==InerSum)
		{
			System.out.println("Xylem Number");
		}
		else 
		{
	
			System.out.println("Phloem number");
		}
		
	}

}

