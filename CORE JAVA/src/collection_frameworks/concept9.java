package collection_frameworks;
import java.util.*;
class concept9
{
	public static void main(String args[])
	{	
	HashMap<String,String> map = new HashMap<String,String>();
		int count=0;
		map.put("48","Deep Shah");
		map.put("03","Aniruddh Chawada");
		map.put("41","Jay Pithava");
		map.put("02","Prem Jani");
		map.put("04","Manahar Udhas");
		map.put("05","Shanker Jay Kishan");
		if(!map.isEmpty())
		{
			System.out.println(map.size());
			for(HashMap.Entry<String,String> entry : map.entrySet())
			{
				String key = entry.getKey();
				String value = entry.getValue();
				System.out.println("This Is All Keys => " + key);
				System.out.println("This Is All Values According Above Keys => " + value);
			}
		}
		else
		{
			System.out.println("Sorry , This Map Is Empty !");
		}
	}
}