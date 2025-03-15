package constuctorintilizatiion;

//all file save at time ctrl+shift+s
// minimize & maximize ctrl+m,
//how to align the prorgram ctr+A, then ctrl+i

public class car 
{

	String Brand;
	int cost;

	car(String Brand,int cost)
	{
		this.Brand=Brand;
		this.cost=cost;
	}

	public static void main(String[] args) 
	{

		car c=new car("BMW",2500000);
		car c1=new car("Honda",5246265);

		System.out.println(c.Brand+" "+c.cost);
		System.out.println(c1.Brand+" "+c1.cost);

	}

}
