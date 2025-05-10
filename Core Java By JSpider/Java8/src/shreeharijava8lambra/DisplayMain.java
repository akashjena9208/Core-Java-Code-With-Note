package shreeharijava8lambra;

public class DisplayMain {
	public static void main(String[] args) {
		//1.Implemnting Class
		Display d=new Displayimpl();
		System.out.println(" Implenting Class :-"+ d.getSize("Akash Jena"));

		//Annomious Inner Class
		Display d1 = new Display() {

			@Override
			public int getSize(String s) {

				return s.length();
			}

		};
		
		System.out.println("Anonimious :---->"+d1.getSize("Akash"));
		
		
		

		//Lambra exprsion
		
		Display d2= (s) -> {return s.length();};
		System.out.println("Lambra exprsion " + d2.getSize("Java"));
		
		
		Display d3= s -> {return s.length();};
		System.out.println("Lambra exprsion " + d2.getSize("Java Shree hari"));
		
		
		
		Display d4=s-> s.length();		
		System.out.println(d4.getSize("Jspider"));
	}
	

}
