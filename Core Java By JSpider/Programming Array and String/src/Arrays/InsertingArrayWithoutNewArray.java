package Arrays;

import java.util.Scanner;
public class InsertingArrayWithoutNewArray {
	public static void main(String[] args) {
		int arr[]=ArarayOperation.readarraya();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("ENter The Index ");
		
		int id=sc.nextInt();
		
		System.out.println("Enter The Elemnet");
		int element=sc.nextInt();
//		insertElement(arr, id, element);
		isInsert(arr, id, element);
		
	}

//	public static void insertElement(int[] ar,int index,int elements)
//	{
//		int j=ar.length-2;
//		while(j>=index)
//		{
//			ar[j-1]=ar[j];
//			j--;
//		}
//		ar[index]=elements;
//		
//		ArarayOperation.display(ar);
//	}
	
	//or
	
	
	
	public  static void isInsert(int[] ar,int index,int elements)
	{
		int j=ar.length-1;
		while(j>index)
		{
			ar[j-1]=ar[j];
			j--;
		}
		ar[index]=elements;
		ArarayOperation.display(ar);
	}
}


