package Loop;

public class demoenhanchedforloop {
    public static void main(String[] args){
		int nums[][]={
					{3,9,7,5},
					{2,4,6,8},
                    {1,2,3,4,5}
				};
		for(int a[]:nums) // nums  array are store in a "a " varibale
		{
			for(int b:a) //a are store in b and a are print
			{
				System.out.print(b+ " ");
			}
			System.out.println();
		} 
	}
}




