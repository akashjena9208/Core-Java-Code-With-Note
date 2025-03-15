package com;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ALSortStudent {
	public static  void main(String[] args) {
		Student s1=new Student(2001,77.9,"Akash");
		Student s2=new Student(1802,67.9,"Aakash");
		Student s3=new Student(8003,97.9,"Rakesh");
		Student s4=new Student(2004,47.9,"Subha");
		
		List<Student> lst = new LinkedList<Student>();
		
		lst.add(s1);
		lst.add(s2);
		lst.add(s3);
		lst.add(s4);
		
//		for(int i=0;i<lst.size();i++)
//		{
//			Student s=lst.get(i);
//			System.out.println(s);
//		}
//		
		
		
//		for(Student ld:lst)
//			//for(int ld:lst)	//Type mismatch: cannot convert from element type Student to int
//			{
//				System.out.println(ld);
//			}
			
		Collections.sort(lst);
		
		for(Student ld:lst)
		{
			System.out.println(ld);
		}
		
		
	}

}
