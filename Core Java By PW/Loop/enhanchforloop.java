package Loop;

public class enhanchforloop {
    public static void main(String[] args){
		int nums[][]={
					{3,9,7,5},
					{1,5},
					{8,4,5}
				};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<nums[i].length;j++)
			{
				System.out.print(nums[i][j]+ " ");
			}
			System.out.println();
		} 
	}
    
}
