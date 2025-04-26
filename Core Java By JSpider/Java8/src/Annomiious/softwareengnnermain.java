package Annomiious;

public class softwareengnnermain {
	int a=33; //Global varibale
/*	public static void main(String[] args) {
		

//		softwareengnner se = () -> {
//
//			return "10cr";
//		};
//
//		System.out.println(se.getsalary());
		
		
		dosmething();

	}
	*/
	
	private  void dosmething()
	{
		//int a=2;	//local varibale
		softwareengnner se = () -> {
			a=3; //error bcz its final inside  
			return "10 cr";
		};

		System.out.println(se.getsalary());
	}

}
