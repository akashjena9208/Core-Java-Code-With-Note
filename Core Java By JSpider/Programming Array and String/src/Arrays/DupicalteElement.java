package Arrays;

public class DupicalteElement 
{
	public static void main(String[] args) {
		int arr[]= {10,20,30,10,20};
		
		for(int i=0;i<arr.length;i++)	//traves the array
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])	//
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
