package collection_frameworks;
import java.util.*;
class concept8
{
	public static void main(String args[])
	{	
	HashMap<String,String> map = new HashMap<String,String>();
	Scanner sc=new Scanner(System.in);
		int count=0;
		map.put("48","Deep Shah");
		map.put("03","Aniruddh Chawada");
		map.put("41","Jay Pithava");
		map.put("02","Prem Jani");
		map.put("04","Manahar Udhas");
		map.put("05","Shanker Jay Kishan");
		System.out.println("Enter Any Key =>");
		String key = sc.nextLine();
			if(map.containsKey(key))
			{
				System.out.println("This Key According Value Is =>" + map.get(key));
			}
			else
			{
				System.out.println("This Key-Value Mapping Is Not Available !");
			}
		System.out.println("Enter Any Value =>");
		String value = sc.nextLine();
			if(map.containsValue(value))
			{
				System.out.println("This Value Mapping Exist In This Map !");
			}
			else
			{
				System.out.println("This Key-Value Mapping Is Not Available !");
			}
	}
}