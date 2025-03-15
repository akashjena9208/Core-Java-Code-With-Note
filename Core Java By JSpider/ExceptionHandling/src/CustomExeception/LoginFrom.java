package CustomExeception;

import java.util.Scanner;

public class LoginFrom {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter User Id");
		String id=sc.nextLine();
		System.out.println("Enter  User  password");
		int password=sc.nextInt();
		
		if(id.equals("akash"));
		{
			if(password==123)
			{
				System.out.println("Login SucessFull!!!");
			}
			else
			{
				try
				{
//					throw new InvalidPasswordExeception();
					//or
					InvalidPasswordExeception obj= new InvalidPasswordExeception();
					throw obj;
				}
				
				catch(InvalidPasswordExeception obj)
				{
					System.out.println("Invalid Passowrd");
				}
			}
		}
		
		sc.close();
		
		
	}

}
