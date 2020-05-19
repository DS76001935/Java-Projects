package collection_frameworks;
import java.util.*;
class concept7
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
		map.clear();
		System.out.println(map.size());
		System.out.println(map.get("05"));
	}
}