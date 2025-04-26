package newlearn;
interface first
{
	default void sayhello() {
		System.out.println("First One");
	}
}


interface second
{
	default void sayhello() {
		System.out.println("Second  One");
	}
}

public class Myclass implements first,second {

	@Override
	public void sayhello() {
//		first.super.sayhello();
		second.super.sayhello();
	}
	
	public static void main(String[] args) {
		Myclass obj=new Myclass();
		obj.sayhello();
	}

}
