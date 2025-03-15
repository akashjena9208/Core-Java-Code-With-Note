package SortingComparator;

public class Mobile {
	int price;
	
	String Model;
	
	Mobile(int price,String Model)
	{
		this.price=price;
		this.Model=Model;
	}

	@Override
	public String toString()
	{
		return price+" "+Model;
	}
}
