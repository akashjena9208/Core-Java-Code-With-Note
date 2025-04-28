package shreeharijava8Class;
//method inside  varibale and class will created 

public class MethodLocalnner2 {
	
	
	MethodLocalnner2 run()
	{
		System.out.println("run() started");
		
		class Demo extends MethodLocalnner2
		{
			
		}
		
		
		Demo d= new Demo();
		System.out.println(d);
		System.out.println("run() finshed");
		
		return d;
	}
	
	

}
