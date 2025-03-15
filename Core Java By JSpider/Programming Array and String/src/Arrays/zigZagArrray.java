package Arrays;
//write a java program 2 array in zizage manner
import java.util.Scanner;

public class zigZagArrray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ar[]=ArarayOperation.readarraya();
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		int br[]=ArarayOperation.readarraya();
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		int cr[]=new int[ar.length+br.length];

	
	}
	public static void merge(int ar[],int br[],int cr[])
	{
		int i=0;
		int j=0;
		int k=0;
		 while(k<cr.length)
		 {
			 if(i<ar.length)
			 {
				 cr[k++]=ar[i++];
			 }
			
		 }
	
	}
	
}
