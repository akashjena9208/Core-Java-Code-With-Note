package Expriment;

public class DEmo {
	public static void main(String[] args) {
	int a=20;
	int b=20;
	
	System.out.println(a==b);
	
	
	Integer c = 20;
	Integer d = 20;
	System.out.println(c==d);
	System.out.println(c.equals(d));
	
	String e = "Hello";
	String f = "Hello";
	
	System.out.println(e==f);
	System.out.println(f.equals(e));
	
	String s1=new String("Hello");
	String s2=new String("Hello");
	System.out.println(s1=s2);
	
	}
}
