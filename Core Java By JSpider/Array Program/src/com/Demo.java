
package com;

public class Demo {

	public static void main(String[] args) {
		// Array Declaration
		int[] a;


		//Array Creation
		a= new int[4];

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
//		System.out.println(a[4]);	//Index 4 out of bounds for length 4
		System.out.println("..................................");

		// Array intilization
		a[0]=10;
		a[3]=50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[3]);
		System.out.println("..................................");


		//Array creation and declaration

		double[] d= new double[2];

		System.out.println(d[0]);
		System.out.println(d[1]);
		
		System.out.println("................................");
		d[0]=2.55;
		d[1]=5;

		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println("................................");

		//Array declartion and intilization

		int[] num= {10,20,30,4};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[3]);


		// length of array
		System.out.println("Lenagth of ac "+a.length);


	}

}
