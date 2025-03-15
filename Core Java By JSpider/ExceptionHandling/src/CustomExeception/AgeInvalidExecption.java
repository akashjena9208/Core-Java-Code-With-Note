package CustomExeception;

//Uncheked
public class AgeInvalidExecption  extends RuntimeException{

	private String message;

	public AgeInvalidExecption(String message) {
		this.message=message;
	}

	//it is override method it is presant throwable class
	@Override
	public String getMessage()
	{
		return message;

	}






}
