package PremitiveCasting;
class Demo 
{
	public static void main(String[] args) {
		
		//Widdig
		int a=10;
		double b=a;
		System.out.println(a+" "+b);	//10 10.0
		
		
		double c=50;
		System.out.println(c);//50.00
		
		
		char x='A';
		char y='Z';
		
		int m=x;
		int n=y;
		
		System.out.println(x+" "+m);//A 65
		System.out.println(y+" "+n);	// Z 90
		
		
		char aa='a';
		char bb='z';
		System.out.println();
		
		
		
		System.out.println("---------------------------------------------------------------------");
		//Narrowing 
		double i=23.51;
		int j=(int) i; 	// why cast bcz data loss chance possible so cast
		System.out.println(i+" "+j); 	//23.51 23
		
		
		int z=(int) 45.67;
		System.out.println(z); ///45
		
		
		int p=68;
		char q=(char) p;
		System.out.println(p+" "+q); //68 D
		
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println((int)65.75); //65
		System.out.println((char)65); //A
		//string concat anything =String
		//Anything + String =String
		
		System.out.println("A"+"B");
		System.out.println("A"+10);
		
		System.out.println('A'+"B");
		
		
		System.out.println("A"+10+20);
		System.out.println(10+20+"A");
		System.out.println('A'+'B');
		System.out.println('a'+20);
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
