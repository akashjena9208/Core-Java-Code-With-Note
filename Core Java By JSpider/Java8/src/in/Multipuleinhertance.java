package in;
interface demo1
{
	int X=10;
	default void display() 
	{
		System.out.println("Crud Rice!!");
	}

}

interface demo2 
{
	int X=20;
	default void display() {
		System.out.println("Biryani!!");
	}
}

class demoo implements demo1,demo2
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		demo1.super.display();
		demo2.super.display();
	}

}

public class Multipuleinhertance {
	public static void main(String[] args) {
			demoo obj=new demoo();
			obj.display();
			System.out.println(demo1.X);
			System.out.println(demo2.X);
	}
}
