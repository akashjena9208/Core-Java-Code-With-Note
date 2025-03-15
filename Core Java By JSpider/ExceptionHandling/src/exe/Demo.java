package exe;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Programm Started.....");
		
		int arr[]= {1,2,3,4};
		
		try
		{
			//Critcal Section
			System.out.println(10/0);
		}
		//one 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid Denomation "+e);
		}
		catch (ArithmeticException e) {
			System.out.println("Invalid denomation "+e);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception Handel"+e);
		}
		
		System.out.println("Programm End");
	}

}
//compiler force to devloper 

