package ConstuctorOverloadding;

 class shopping 
{
	String shopName,productName;
	int cost;
	
	public shopping(String shopName) 
	{
		this.shopName=shopName;
	}
	
	public shopping(String shopName,String productName) 
	{
		this.shopName=shopName;
		this.productName=productName;
	}
	
	public shopping(String shopName,String productName,int cost) 
	{
		this.shopName=shopName;
		this.productName=productName;
		this.cost=cost;
	}
	
}

public class mainshopping
{
	public static void main(String[] args) {
		shopping s1=new shopping("Mbazar");
		System.out.println(s1.shopName);
		
		shopping s2=new shopping("BigBazar","Bag");
		System.out.println(s1.shopName+" "+s1.productName);
		
		shopping s3=new shopping("Vmart ","Laptop ",100000);
		String s4=s3.productName+s3.shopName+s3.cost;
		System.out.println(s4);
		
	}
}




