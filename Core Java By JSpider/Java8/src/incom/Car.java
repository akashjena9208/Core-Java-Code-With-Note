package incom;

public class Car 
{
	void display()
	{
		System.out.println("Outer Class");
	}
	
	class engine
	{
		void disp()
		{
			System.out.println("innner class");
		}
	}
	
	public static void main(String[] args) {
		Car c= new Car();
		c.display();
		
		Car.engine e=c.new engine();
		e.disp();
	}

}
