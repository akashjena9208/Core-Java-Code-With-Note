package StarPrinting;
 
import java.util.Scanner;

public class star8 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scanner.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			
				if(i<=j && i+j<=n+1)
				{
					System.out.print("*"+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}

	}
}
