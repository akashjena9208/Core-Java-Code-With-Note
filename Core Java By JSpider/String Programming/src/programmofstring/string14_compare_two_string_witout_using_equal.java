package programmofstring;
//wjp to compare two string witout using equal methods
public class string14_compare_two_string_witout_using_equal {
	public static void main(String[] args) {
		String s1="hello";
		String s2="hello";

		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();

		boolean flag = false;
		for(int i=0;i<ch1.length;i++)
		{

			if(ch1[i]!=ch2[i])
			{
				flag = true;
				break ;
			}
		}
		
		if(flag==true)
		{
			System.out.println("Not  Equal");
		}
		
		else
		{
			System.out.println("equal");
		}
		
	}
}
