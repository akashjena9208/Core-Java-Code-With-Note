package ctp;
// static polymophism

class Netflix {
	static void login(String email,int password)
	{
		System.out.println("Login the NEtflix Account using email& password");
		
	}
	
	static void login(int password,String Name)
	{
		System.out.println("Login the Netflix Account using Contact np & OTP");
	}
	
	public static void main(String[] args) {
		Netflix.login("akash@522", 2001);
		System.out.println("-------------------------------------------------");
		login(2580, "akash@ganil.com");
		
	}

}
