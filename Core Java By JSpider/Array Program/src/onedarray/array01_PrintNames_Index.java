package onedarray;
import java.util.Scanner;
public class array01_PrintNames_Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size");
		int size=sc.nextInt();

		System.out.println("Enter The Array Element");
		String [] name=new String[size];

		//to take the name  from the user dynamically
		for(int i=0;i<name.length;i++)
		{
			name[i]=sc.nextLine();
		}
		//Printing the Value 
		for(int j=0;j<name.length;j++)
		{
			System.out.println(name[j]+"----->"+j);
		}
		sc.close();


	}
}
