package programmofstring;
//wjp to find the count of upper case charater and low case cherater in preasnt string
//space not incule that is no upper no lower their spacl chareter
public class string02_Count_UpperCase_Lowercase {
	public static void main(String[] args) {
		
		String str="Welome To JSpider";
		int uppercaseCount=0;
		int lowercasecharter=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<'Z')
			{
				uppercaseCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<'z')
			{
				lowercasecharter++;
			}
			
//			System.out.println(str.charAt(i)+"  Upper Case Count is:--> "+uppercaseCount);
//			System.out.println(str.charAt(i)+"  Lower Case Count is:--->"+lowercasecharter);
		}
		System.out.println("Upper Case Count is:--> "+uppercaseCount);
		System.out.println("Lower Case Count is:---> "+lowercasecharter);
		
		System.out.println(".....................Using ToCharray..............................................");
		char[] ch=str.toCharArray();
		int uc=0;
		int lc=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]>='Z')
			{
				uc++;
			}
			else if(ch[i]>='a' && ch[i]>='z')
			{
				lc++;
			}
		}
		
		System.out.println("Uper case count :-> "+uc);
		System.out.println("Uper case count :-> "+lc);
	}
}
