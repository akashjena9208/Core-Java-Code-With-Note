package hasA.com;

class  vehichal
{
	String brand="Sizuki";
	
}

class car extends vehichal{
	int cost=5000;
}



public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c=new car();
		System.out.println(c);
		System.out.println(c.brand);
		System.out.println(c.cost);
	}

}
