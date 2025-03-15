package arraysOneD;
//wrjp take n chareter i/p print the first charter
import java.util.Scanner;

public class arr03 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Charecter");
		char ch[]=new char[5];
		int i=0;
		ch[i]=sc.next().charAt(2);
		
		for(i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		
		sc.close();
	}

}
