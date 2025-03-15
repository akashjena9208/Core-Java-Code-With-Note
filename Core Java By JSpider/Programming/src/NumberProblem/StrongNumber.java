package NumberProblem;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

//write java program to the given number is strong or not
//the sum so factorial of each digit in a number is =  the giveNumber
//ex 145,1!+4!+5!=1+24+120=145 fn==1!+4!+5!=1+24+120;
public class StrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number ");
		int FN=scanner.nextInt();
		int sum=0;	
		int temp=FN;	
		while(FN!=0)
		{
			int prod=1;
			int digit=FN%10;
			for(int i=1;i<=digit;i++)
			{
				prod=prod*i;
			
			}
			sum=sum+prod;
			FN=FN/10;
		}
		
		
		
		
		System.out.println(FN);

	}
	
//	if(sum==temp)
	
	
	}

