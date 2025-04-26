package threadjava8;
/*
 *if i craete one custom thred that time We implemnt a Runbale Interface one class then override run() method bcz Runbale Interface is Functional interface that accept the implention instace oof this We used java 8
 *create a lambrda exception  proveide the implemntaion and store the Runaleble type refence
 * */
public class Main {
	public static void main(String[] args) {
//		MyClass myClass=new MyClass();
//		Thread thread=new Thread(myClass);
//		thread.run();
		
		//Using java 8  MyClass implemnt runable interface and overide the run() but java 8 directly do that
		
		Runnable runnable=() -> {
			for(int i=1;i<=10;i++)
			{
				System.out.println("Custom Thread Create using java 8"+i);
			}
		};
		
		Thread java8thread=new  Thread(runnable);
		java8thread.run();
		
		
	}

}
