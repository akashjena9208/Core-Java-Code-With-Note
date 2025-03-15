package NumberProblem;
import java.util.Scanner;

public class BackWardIteration 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for n: ");
		int n = sc.nextInt();

		for(int i=n;i>=1;i--)
		{
			System.out.println(i);
		}

		sc.close();
	}

}
