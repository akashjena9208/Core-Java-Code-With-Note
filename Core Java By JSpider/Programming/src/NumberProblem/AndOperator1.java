package NumberProblem;
//wrjp 2 char   from user cheack whetever first char lessthen 2nd char  and 2nd char is equal first char or not
import java.util.Scanner;

public class AndOperator1 
{
	public static void main(String[] args) 
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the First Char");
		char a=scanner.next().charAt(0);
		System.out.println("enter a Second Char");
		char b=scanner.next().charAt(0);
		
		if (a<b && a==b)
		{
			System.out.println("condition satisfied");
			
		}
		else {
			System.out.println("Condition Declaen");
		}

		scanner.close();
		
	}
}
