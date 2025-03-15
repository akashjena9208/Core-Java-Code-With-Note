package in;
interface aa
{
	void show();


	default void showing()
	{
		System.out.println("Define SucessFull");
	}

	static void abc()
	{
		System.out.println("static interface implemataion method");
	}

}
class bb implements aa
{

	@Override
	public void show() {
		
		System.out.println("nornal abstract ovverride method");
	}
	
	public  void showing()
	{
		System.out.println("Hey  I am override the default methode ");
	}
	
	static  void abc()
	{
		System.out.println("Can not override static method");
	}

}
public class Java8Fe {
	public static void main(String[] args) {
		aa.abc();
		aa obj= new bb();
		obj.show();
		obj.showing();
	}
}
