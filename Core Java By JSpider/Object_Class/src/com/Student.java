package com;

import java.util.Objects;

public class Student {
	int sid;
	double percs;
	String name;
	
	public Student(double percs) {
		this.percs = percs; 
	}
	



	@Override
	public int hashCode() {
		Double d=percs;
		return d.hashCode();
	}



	public static void main(String[] args) {
		Student s=new Student(10);
		System.out.println(s.hashCode());	//746292446
//		s.hashCode();
	}
}
