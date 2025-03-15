package simplearrays;

public class arr10 {
	public static void main(String[] args) 
	{
		int ar[]= {10,90,85,75,32};
		int Flarg=ar[0];	//imagin  1 is large
		int Slarge=ar[1];	//imagin 2 is large
		
		for(int i=0;i<ar.length;i++)
		{
		
			if(ar[i]>Flarg)
			{
				Slarge=Flarg;
				Flarg=ar[i];			
			}
			else if(ar[i]>Slarge && ar[i]!=Flarg)
			{
				Slarge=ar[i];
			}			
		}
		
		System.out.println("2nd Largest Element is: "+Slarge);
	}
}
