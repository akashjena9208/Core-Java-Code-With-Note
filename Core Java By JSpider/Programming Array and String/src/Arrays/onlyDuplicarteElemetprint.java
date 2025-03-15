package Arrays;

public class onlyDuplicarteElemetprint {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,};
		int br[]= {1,2,4,2,5};
		
//		for(int i=0;i<arr.length;i++)	//traves the array
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])	//
//				{
//					System.out.println(arr[i]);
//				}
//			}
//		}
		
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<br.length;j++)
			{
				boolean flag=true;
				if(arr[i]==br[j])
				{                                
					
					if(arr[i]==br[j])
					{
						flag=false;
						br[j]='A';
					}
					
					if(flag==true) {
						System.out.println(arr[i]);
					}
				}
			}
		}
	
	
		

		
		
	}
}
