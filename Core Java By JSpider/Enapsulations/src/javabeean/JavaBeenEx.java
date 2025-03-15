package javabeean;

class stud
{
	private int a;
	private String name;
	
	
	public void setAdd( int a)
	{
		this.a=a;
		
	
	}
	public void setAdd(String name)
	{
	this.name=name;
	
	}
	
	public int geta()
	{
		return a;
	}
	
	public String getname()
	{
		return name;
	}
}

public class JavaBeenEx {
	public static void main(String[] args) {
		stud on=new stud();
		on.setAdd(10);
		on.setAdd("gdgv");
		
		System.out.println(on.geta());
		System.out.println(on.getname());
	}
	
	

}
