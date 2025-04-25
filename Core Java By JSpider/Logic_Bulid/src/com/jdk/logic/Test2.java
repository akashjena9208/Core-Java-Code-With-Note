package com.jdk.logic;


public class Test2 {
	public static void main(String[] args) {

		String m = "10";
		String n = "10";

		System.out.println(m == n);
		System.out.println(m.equals(n));

		System.out.println("------------------------------------");

		String o = new String("20");
		String p = new String("20");

		System.out.println(o == p);
		System.out.println(o.equals(p));

		System.out.println("------------------------------------");

		String str1 = "Akash";
		String str2 = "akash";

		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

		System.out.println("--------------------------------------------");
		Integer a = 100, b = 100;
		Integer x = -128, y = -128;

		System.out.println(a == b);
		System.out.println(x == y);

		System.out.println("------------------------------------");

	}

}
