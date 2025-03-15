package bhiya;

public class DifrencebetweenEvenandOdd {
	public static void main(String[] args) {
		int arr[]= {2,5,4,3,2,9};
		
		int even=0;
		int odd=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even=even+arr[i];
			}
			else
			{
				odd=odd+arr[i];
			}
		}
		System.out.println(even);
		System.out.println(odd);
		int res=0;
		if(even>odd)
		{
			res=even-odd;
			System.out.println("Even Is Big & Diffrence is :- "+res);
		}else
		{
			res=odd-even;
			System.out.println("Odd Is Big & Diffrence is :- "+res);
		}
	}
}
