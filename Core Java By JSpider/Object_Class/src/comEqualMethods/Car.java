package comEqualMethods;


public class Car {
	String Name ,NumberPlate;

	Car(String name,String Numberpalte)
	{
		Name=name;
		this.NumberPlate=Numberpalte;
	}

	@Override
	public String toString()
	{
		return "Car Name"+Name+" "+"Car NumberPlate "+NumberPlate;

	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Car)
		{
			Car c=(Car) obj;
			if(this.NumberPlate.equals(c.NumberPlate))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{

		Car c1= new Car("BMW","2001");
		Car c2=new Car("OD","2002");
		Car c3= new Car("BMW","2001");
		Car c4= new Car("BMW","2002");
		Car c5=new Car("OD","2002");
		Car c6= new Car("BMW","2003");
		

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c4.equals(c5));

		System.out.println(c1==c3);	//adres cheack
	}



}
