package CheackException;

import java.io.FileReader;

public class FileExample {
	//checked 
	void read()
	{
		try {
			FileReader f= new FileReader("Open.text");
		}
		catch(Exception e)
		{
			System.out.println("File id not found");
		}		
	}

	//uncheked 
	void devide()
	{
		//if not handel 
//		try
//		{
//			System.out.println(10/0);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Arithmetic Exception .... "+e);
//		}
		
		System.out.println(10/0);
	}

	
	public static void main(String[] args) {
		FileExample o=new FileExample();
		o.read();
		try
		{
			o.devide();
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic Exception .... "+e);
		}
	}


}

//compiler force , force devloper to handel the 
//