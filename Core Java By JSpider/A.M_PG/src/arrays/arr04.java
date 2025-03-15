package arrays;

public class arr04 {
	public static void main(String[] args) {
		int num[][]=
			{
					{10,20,30,40},
					{1,2,3,4},
					{5,4},
					{120,203,320,430,13,4,43,44},
					{12,22,33,44},
			};
		
		for(int i=0;i<num.length;i++)
		{		
			for(int j=0;j<num[i].length;j++)
			{
				System.out.println(num [i][j]);
			}
		}
		System.out.println("-------------------------------------------------");
		//enhanch for loop
		for(int a[]:num)
		{
			for(int b:a)
			{
				System.out.println(b);
			}
		}
	}
}
