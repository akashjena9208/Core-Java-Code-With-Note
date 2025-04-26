package MethodRefrence;

import java.util.Arrays;
import java.util.List;

//method reffere or method allready presant
//using in place of lambra  refrence 

public class MethodRefrence {
	private static void print(String s)
	{
		System.out.println(s);
	}
	
	
	private  void prints(String s)
	{
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		List<String> li=Arrays.asList("Akash","Subha","Sonu","Inu","Disha");
		
		System.out.println("Lambara exprsiion");
		li.forEach(x->System.out.println(x));
		
		System.out.println("------------method refrence if static ----------");
		//method refrence
		li.forEach(MethodRefrence::print);
		
		System.out.println("------------method refrence if nonstatic ----------");
		MethodRefrence mf=new MethodRefrence();
		li.forEach(mf::prints);
		
		
	}

}
