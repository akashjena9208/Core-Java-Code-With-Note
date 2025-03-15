package Novmber;
class human
{
	human(int x)
	{
		this(0.5);
		System.out.println("Parant  Class int type constuctor ");
	}
	human(double x)
	{
		System.out.println("Huamn Class doublue type constuerctor");
	}
}

class boy extends human
{
	boy(String	z)
	{
		super(10);
		System.out.println("---------------");
		System.out.println("boy class String Type constructor");
		System.out.println("Sigle lavel constuctor");
	}
	
}


class girl extends boy
{

	girl(int a)
	{
		super("hi");
		System.out.println("---------------");
		System.out.println("child class constructor");
		System.out.println("Multi lavel constructor ");
	}
	
}
public class Hybrid {
	
	public static void main(String[] args) {
		new girl(1);
	}
}
