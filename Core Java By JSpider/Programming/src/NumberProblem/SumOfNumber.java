package NumberProblem;
import java.util.Scanner;
public class SumOfNumber 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter value for n :");
		int n = sc.nextInt();

		int sum=0;

		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}

		System.out.println(sum);

		sc.close();
	}

}
