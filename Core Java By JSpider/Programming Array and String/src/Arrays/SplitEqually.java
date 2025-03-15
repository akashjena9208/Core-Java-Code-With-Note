package Arrays;

public class SplitEqually {
	public static void main(String[] args) {
		int ar[]= {10,20,30,40,50,60};
		int br[]=new int[ar.length/2];
		int cr[]=new int[ar.length/2];
		
		for(int i=0;i<ar.length;i++)
		{
			if(i<br.length)
			{
				br[i]=ar[i];
				
			}
			else
			{
				cr[i-ar.length/2]=ar[i];
				
			}
			
		}
		
		
		
	}
}
