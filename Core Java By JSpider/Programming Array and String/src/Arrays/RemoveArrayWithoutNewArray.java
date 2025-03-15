package Arrays;

import java.util.Scanner;

public class RemoveArrayWithoutNewArray {
	public static void main(String[] args) {
		int arr[]=ArarayOperation.readarraya();
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter The Index ");

		int id=sc.nextInt();
		insertElement(arr, id);
		System.out.println("----------------------------");

	}

		public static void insertElement(int[] ar,int index)
		{
			int j=index;
			while(j<ar.length-1)
			{
				ar[j]=ar[j+1];
				j++;
			}
			ar[j]=0;
			
			ArarayOperation.display(ar);
		}

	
}
