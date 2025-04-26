package newlearn;
interface aa
{
	static void add()
	{
		System.out.println("Hlw I m add");
	}
	
}
public class Mycalss implements aa {
	
	static void add()
	{
		System.out.println("Hlw I m add sso");
	}
	
	public static void main(String[] args) {
		aa.add();
		Mycalss.add();
	}

}
