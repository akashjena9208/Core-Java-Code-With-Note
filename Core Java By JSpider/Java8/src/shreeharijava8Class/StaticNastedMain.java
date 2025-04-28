package shreeharijava8Class;

public class StaticNastedMain {
	public static void main(String[] args) {
		StaticNasted s=new StaticNasted();
		System.out.println(s);
		
		StaticNasted.innertest s1=new StaticNasted.innertest();
		System.out.println(s1);
	}

}
