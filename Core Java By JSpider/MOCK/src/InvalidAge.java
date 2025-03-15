

public class InvalidAge extends Exception {
	
	private String msg;
	
	public InvalidAge(String msg) {
		this.msg=msg;
	}
	
	@Override
	public String getMessage()
	{
		return msg;
		
	}
	
	
}
