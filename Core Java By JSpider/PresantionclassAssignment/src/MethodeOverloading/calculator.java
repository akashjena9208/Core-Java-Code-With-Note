package MethodeOverloading;

public class calculator 
{
	int a;
	int b;
	int c;
	
	int add(int a,int b)
	{
		int res=a+b;
		System.out.println("Adding Two value Vaule "+res);
		return res;	
	}
	
	int add(int a,int b,int c)
	{
		
		int result=a+b+c;
		System.out.println("Adding Three values "+result);
		return result;
	}
	
	public int multi(int x,int y) 
	{
		int res=x*y;
		System.out.println("Multipule two values "+res);
		return res;
	}
	
	public int multi(int x,int y,int z)
	{
		
		int result=x*y*z;
		System.out.println("Multipule Three values "+result);
		return result;
	}
	
	public static void main(String[] args) 
	{
		calculator c= new calculator();
	int mm=	c.add(10,20);
	System.out.println(" Value print inside mainmethode............"+mm);
		c.add(10, 20, 30);
		c.multi(10, 10);
		c.multi(10, 2, 5);
		
		
		
	
	}

}
