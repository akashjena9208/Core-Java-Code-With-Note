package Novmber;
///write java programme active non premitive typecasting avoid exception
class getWay
{
	int tide =665429563;
}

class PhonePay extends getWay
{
	String tid="#745896123";
}

class  netFlix extends  getWay
{
	int tidee=7458955;
}
public class NonpremitiveTypeCasting 
{
	static void disp(getWay obj)//upcast
	{
		if(obj instanceof PhonePay)
		{
			PhonePay p=(PhonePay) obj;// downcast
			System.out.println(p.tid+" "+p.tide);
			
		}
		
		else if(obj instanceof netFlix)
		{
			netFlix n= new netFlix();
			System.out.println(n.tide+" "+n.tidee);
		}
	}
	public static void main(String[] args) 
	{
		 disp(new PhonePay());
		 System.out.println("---------");
		 disp(new netFlix());
		
	}

}
