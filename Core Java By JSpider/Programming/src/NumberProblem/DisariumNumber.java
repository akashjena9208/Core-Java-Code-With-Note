package NumberProblem;

import java.util.Scanner;

//write java program to find disarium number or not;
//when the sum of each digit an number  where each digit rest of the power of position in a number
//ex:-175 || 1 position is 1, 7 position is 2,5 position is 3 || 1 power of 1 \\and  7 power of  2 \\ and 5 power of 3
//1+49+125=175
public class DisariumNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=scanner.nextInt();
		int temp1=n;
		int temp2=n;

		int sum=0;// to find the sum 
		int count=0;// to find the count
		//count of digits
		for(;n!=0;n=n/10)
		{
			count++;
		}

		for(;temp1!=0;temp1=temp1/10)
		{
			int prod=1;
			int digit=temp1%10;


			//to multiply count
			for(int j=1;j<=count;j++)
			{
				prod=prod*digit;
			}
			sum=sum+prod;
			count--;
		}
		if (sum==temp2)
		{
			System.out.println("It is a Disarium Number");
		}
		else {
			System.out.println("It is a Not Disarium Number");
		}



	}
}

