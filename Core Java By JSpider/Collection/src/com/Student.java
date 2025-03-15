package com;

public class Student implements Comparable<Student>{
	int id;
	double percs;
	String name;
	
	
	public Student(int id, double percs, String name) {
		this.id = id;
		this.percs = percs;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", percs=" + percs + ", name=" + name + "]";
	}

	//Sorting
	@Override
	public int compareTo(Student obj) {
		// TODO Auto-generated method stub
		

		
		//desc
//		return this.name.compareToIgnoreCase(obj.name)*-1;
		return this.id-obj.id;
	}
	


	
	
	

}
