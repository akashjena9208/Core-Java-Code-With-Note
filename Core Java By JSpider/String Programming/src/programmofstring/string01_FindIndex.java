package programmofstring;

public class string01_FindIndex {
	public static void main(String[] args) {
		String str="Programs";
		//using chart()
		for(int i=0;i<str.length();i++)
		{
			System.out.println("index value:- "+i+"-----> "+"charatre value:- "+str.charAt(i));
		}
		
		System.out.println("-----------------------------------------------------------------");
		// using tochar()
		char[] ch=str.toCharArray();	
		for(int i=0;i<ch.length;i++)
		{
			System.out.println("index value:- "+i+"-----> "+"charatre value:- "+ch[i]);
		}
	}

}

