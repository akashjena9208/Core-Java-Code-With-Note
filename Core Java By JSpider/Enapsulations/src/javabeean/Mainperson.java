package javabeean;

import java.util.Scanner;

public class Mainperson {
	public static void main(String[] args) {
		Person person=new Person();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age");
		int a=sc.nextInt();
		person.setAge(a);
		int aa=person.getAge();
		
		System.out.println("Person Age is  "+aa);
		
		sc.close();
}
}
