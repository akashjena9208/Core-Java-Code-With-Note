package simplearrays;
// to find smllest elemenet
public class arr9 {
	public static void main(String[] args) 
	{
		int ar[]= {5,2,3,5,4,2};
		int small=ar[0];	//imagin  1 is lowest
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		
		System.out.println(small);
	}
}
