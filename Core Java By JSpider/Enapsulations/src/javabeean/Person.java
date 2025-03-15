package javabeean;

public class Person 
{
	private int age;
	
	public void setAge(int age)
	{
		if(age>0)	//Validaton is perfromed
		{
			this.age=age;
		}
		else {
			System.out.println("Invalid value");
		}
		
	
	}

	public int getAge() {
		return age;
	}

}
