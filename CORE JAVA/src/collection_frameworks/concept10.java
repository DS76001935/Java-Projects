package collection_frameworks;
import java.util.*;
class concept10
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
		
		System.out.println();
		System.out.println("The Whole Set Of All Keys In This Map =>");
		System.out.println();
		System.out.println(map.keySet());
		System.out.println();
		System.out.println("The Whole Set Of All Values In This Map =>");
		System.out.println();
		System.out.println(map.values());
		System.out.println();
		
	}
}