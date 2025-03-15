package mapcol;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Demo {
	
	public static void main(String[] args) {
		
		Map<String, Object> map= new  HashMap<String, Object>();
		map.put("Name", "Akash Jena");	//string
		map.put("Regdno", 2001289215);	//int
		map.put("Hight", 7.5);		//doubule
		map.put("is Student",true);
//		map.put("Skill",new String[]{"Java","Orcal Database"});	//Array
		map.put("Adress",Map.of("City","Blr","Zip","756032"));	//nasted map
	
		System.out.println(".........Value Store Key & Value Pair tht is know as Entry................");
		System.out.println(map);
		
		
		System.out.println("------------------------Get Method:-----------------------------------------");
		System.out.println("Student Name:- " +map.get("Name"));
		
		System.out.println("------------------------Value Acess-----------------------------------------");
		
		//Only Acess Value
		System.out.println("All value Acess :- "+map.values());
//		for(Object obj:map.values())
//		{
//			System.out.println(obj);
//		}
		
		System.out.println("--------------------------Key Acess---------------------------------------");
		//Only key acess
		System.out.println("All Key Acess:-"+map.keySet());
		
//		for(Object obj:map.keySet())
//		{
//			System.out.println(obj);
//		}
		
		System.out.println("--------------------------- value & Key Acess --------------------------------------");
		// key & Values both acess
		for(Map.Entry<String, Object> KV:map.entrySet())
		{
			String Key=KV.getKey();
			Object Val=KV.getValue();
			
			System.out.println("[<{<     "+Key+" :- "+Val+"    >}>]");
		}
		
		System.out.println("Using  Iterator");
		Iterator<Map.Entry<String, Object>> itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,Object> itrn=itr.next();
			
			System.out.println(itrn.getKey()+" : "+itrn.getValue());
		}
		
		System.out.println("Key Presant Or Not Check:- based on key :"+ map.containsKey("Regdno"));
		System.out.println("Value Presant Or Not Check based on key :"+ map.containsValue(2001289215));
		System.out.println("Size of Given Map:- "+map.size());
		
		System.out.println("Map is  Is Empty Or Not  "+map.isEmpty());
		
		System.out.println("Remove The Spicific Entry is :-"+map.remove("Hight"));
		System.out.println(map);
		
		//Remove  all the  entry in Given Map 
		map.clear();
		System.out.println(map);
		System.out.println("----------------------------------------------------------");
		Map<Integer, String> map1= new  HashMap<Integer, String>();
		map1.put(1, "Akash");
		map1.put(2, "Akash");
		map1.put(3, "Inu");
		map1.put(4, "Smruti");
		map1.put(5, "Sonu");
		System.out.println(map1);	
		map1.put(1, "Subha");	//if add same key another value that can replace
		System.out.println(map1);	
		
		Map map2= new  HashMap();	// it store hetrigenous data bcz i can not mention any thing so putall method work
//		Map<Integer ,Integer> map3= new  HashMap<Integer ,Integer>();	//but in case  not suppport bcz one map Integer and string another map Interger intger type
		map2.put(1,10);
		map2.put(2,20);
		map2.put(3,30);
		map2.put(4,40);
		map2.put(5,50);
		System.out.println(map1);	//{1=Subha, 2=Akash, 3=Inu, 4=Smruti, 5=Sonu}
		System.out.println(map2);	// {1=10, 2=20, 3=30, 4=40, 5=50}
		map2.putAll(map1);	
		System.out.println(map2);	//i add same key another value so that can replace
		
System.out.println("----------------------");
//Iterator<Map.Entry> itre=map2.entrySet().iterator();
//while(itre.hasNext())
//{
//	Map.Entry<> itrne=itre.next();		//eror bcz it cannot be parameterized with arguments 
//	
//	System.out.println(itrne.getKey()+" : "+itrne.getValue());
//}
		
		
	
		
		
	}

}
