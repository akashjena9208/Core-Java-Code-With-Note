package simplearrays;

public class MargeTheElement {
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6};
		
		int arr3[]=new int[arr1.length+arr2.length];
//		System.out.println(arr3.length);
		
//		int index=arr1
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[arr1.length+i]=arr2[i];
			int a=arr3[arr1.length+i];
			System.out.println(a);
		}
		
		
	}
}
