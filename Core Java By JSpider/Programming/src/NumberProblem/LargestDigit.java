package NumberProblem;

import java.util.Scanner;

public class LargestDigit 
{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number");
		int d=scanner.nextInt();
		int largest=0;
		while(d!=0)
		{
			
			int digit=d%10;		
			if(digit>largest)
				largest=digit;
				d=d/10;
					
		}
		System.out.println("Larger number of given code is "+largest);
		scanner.close();
		
	}

}
