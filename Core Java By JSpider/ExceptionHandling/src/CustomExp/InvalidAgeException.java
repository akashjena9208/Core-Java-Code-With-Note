package CustomExp;
//Unchecked Excepption
public class InvalidAgeException  extends RuntimeException{
	
	private String message;
	
	
	public InvalidAgeException(String message)
	{
		this.message=message;
	}
	
	public String getMessage()
	{
		return this.message;
	}
}


