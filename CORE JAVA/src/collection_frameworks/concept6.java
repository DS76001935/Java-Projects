package collection_frameworks;
import java.util.*;
class concept6
{
	public static void main(String args[])
	{
		HashMap<String,String> hm1 = new HashMap<String,String>();
		HashMap<String,String> hm2 = new HashMap<String,String>();
		hm1.put("48","Deep Shah");
		hm1.put("03","Aniruddh Chawada");
		hm1.put("41","Jay Pithava");
		hm1.put("02","Prem Jani");
		hm1.put("04","Manahar Udhas");
		hm1.put("05","Shanker Jay Kishan");
		/*System.out.println(hm.get("48"));
		System.out.println(hm.get("03"));
		System.out.println(hm.get("41"));
		System.out.println(hm.get("02"));
		System.out.println(hm.get("04"));
		System.out.println(hm.get("05"));*/
		System.out.println();
		System.out.println("This Is a Operation Of Coping One HashMap To Another HashMap !");
		System.out.println();
		System.out.println("All the Elements Of 1ST Hashmap =>");
		System.out.println();
		for(HashMap.Entry<String,String> entry:hm1.entrySet())
		{
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println("Key=>" + key + "\t\tValue=> " + hm1.get(key));
			hm2.put(key,value);
		}
		System.out.println();
		System.out.println("This Is Numbers Of Key-Value Mapping in This 1ST Hash Map => " + hm1.size());
		System.out.println();
		System.out.println("All the Elements Of 2ND Hashmap =>");
		System.out.println();
		for(HashMap.Entry<String,String> entry:hm2.entrySet())
		{
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println("Key=>" + key + "\t\tValue=>" + hm2.get(key));
		}
		System.out.println();
		System.out.println("This Is Numbers Of Key-Value Mapping in This 2ND Hash Map => " + hm2.size());
		System.out.println();
	}
}