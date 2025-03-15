package arrays;

public class ar03 {
	public static void main(String[] args) {
		int num[][]=new int[3] [2];
		num[0][0]=1;
		num[0][1]=2;
		num[1][0]=3;
		num[1][1]=4;
		num[2][0]=5;
		num[2][1]=6;
		
		
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
