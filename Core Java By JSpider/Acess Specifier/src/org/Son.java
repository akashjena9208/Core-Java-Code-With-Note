package org;

import com.Father;
//Accessing protected  Members in different package we need to import and is A realtion but the parent class should be public
class Son  extends Father	//son not requried public
{
	public static void main(String[] args) {
		Son s=new Son();
		System.out.println(s.name);
		System.out.println(s.age);
	}
}
