package simplearrays;
//Largest element of given array
public class arr8 {
	public static void main(String[] args) 
	{
		int ar[]= {1,2,3,5,4};
		int larg=ar[0];	//imagin  1 is large
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>larg)
			{
				larg=ar[i];
			}
		}
		
		System.out.println(larg);
	}
}
