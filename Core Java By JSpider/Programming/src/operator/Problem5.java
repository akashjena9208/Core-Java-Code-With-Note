package operator;
import java.util.Scanner;
public class Problem5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number :");
		int a =sc.nextInt();

		System.out.println("Enter 2nd number :");
		int b =sc.nextInt();

		System.out.println("Enter 3rd number :");
		int c =sc.nextInt();

		int greatest = (a>b && a>c)?a:(b>c)?b:c;

		System.out.println("The greatest number is "+greatest);

		sc.close();

	}
}
