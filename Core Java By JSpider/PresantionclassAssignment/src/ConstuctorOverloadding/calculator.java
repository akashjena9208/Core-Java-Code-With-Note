package ConstuctorOverloadding;


public class calculator 
{
	int a;
	int b;
	int c;
	
	
	
	public calculator(int a, int b) {
		// TODO Auto-generated constructor stub
		int res=a+b;
		System.out.println("Adding Two value Vaule "+res);
	}

	public calculator(int x,int y,int z) {
		// TODO Auto-generated constructor stub
		int res=x+y+z;
		System.out.println("Adding T value Vaule "+res);
	}

	
	public static void main(String[] args) 
	{
		calculator c= new calculator(10,20);
		calculator c1=new calculator(10,10, 10);
	
		System.out.println("Object Adress");
		System.out.println(c);
		System.out.println(c1);
		

	}
		
	

}
