package NumberProblem;

import java.util.Scanner;

//if sum of each digit of number where each digit rest to the power number of digit /count of digit of number 
public class ArmStrong {
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
		}
		if (sum==temp2)
		{
			System.out.println("It is a ArmStrong Number");
		}
		else {
			System.out.println("It is a Not ArmStrong Number");
		}


		
		scanner.close();

	}
}
