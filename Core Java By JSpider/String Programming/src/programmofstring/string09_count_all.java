package programmofstring;
//code not work
import java.util.Scanner;

//wjp to find count of vowels consuntes uppercase char specal char and digight
public class string09_count_all {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The String");
		String str=sc.nextLine();

		int uppercaseCount=0;
		int lowercasecharter=0;
		int decimalchater=0;
		int specallchater=0;
		int vowelchar=0;
		int lowerchar=0;

		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')
			{
				uppercaseCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				lowercasecharter++;
			}
			else if(str.charAt(i)>='0' && str.charAt(i)<'9')
			{
				decimalchater++;
			}
			else
			{
				specallchater++;
			}

			if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z') )
			{
				if((str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')//..lower case
						||
						(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'))//..uper caase 
				{
					vowelchar++;
				}
				else {
					lowercasecharter++;
				}
			}

		}
		
		System.out.println("Upper Case Count is:--> \t\t" +uppercaseCount);
		System.out.println("Lower Case Count is:--->\t\t"+lowercasecharter);
		System.out.println("Specal Case Count is:--->\t\t" +specallchater);
		System.out.println("Number Case Count is:--->\t\t"+decimalchater);
		System.out.println("Vowl Case Count is:--->\t\t" +specallchater);
		System.out.println("Conusnet Case Count is:--->\t\t"+lowercasecharter);
		
		sc.close();

	}
}
//wjp to convort even index char to uppercase
//wjp to convort odd to index char to lower
