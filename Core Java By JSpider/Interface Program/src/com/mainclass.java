package com;
interface himu
{
	void add();
	
	 default int sub()
	{
		 System.out.println();
		return 0;
	
	}
}
public class mainclass {
	
	public static void main(String[] args) {
		himu h =()->  System.out.println("hii");
				
	}
	

}
