package shreeharijava8Class;

public class SampleInnerClassMain {
	public static void main(String[] args) {
		Sample s =new Sample();
		System.out.println(s);	//shreeharijava8Class.Sample@3fee733d
		
		Sample.Demo s1=s.new Demo();
		System.out.println(s1);	//shreeharijava8Class.Sample$Demo@4617c264
		
		
		
		Sample.Demo s2=new Sample().new Demo();
		System.out.println(s2);	//shreeharijava8Class.Sample$Demo@36baf30c
	}

}
