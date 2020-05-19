package collection_frameworks;
import java.util.*;
public class concept12
{
	static int size,i;
	static HashSet<deep> hs=new HashSet<deep>();
	public static void fun()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size Of Elements =>");
		size = sc.nextInt();
		for (i = 0; i < size; i++)
		{
			deep d1=new deep();
			System.out.print("Enter Your Rollno =>");
			d1.rollno=sc.nextInt();
			System.out.print("Enter Your Name =>");
			sc.nextLine();
			d1.name=sc.nextLine();
			hs.add(d1);
		}
	}
	public static void main(String args[])
	{
		fun();
			int i=1;
			for(deep d:hs)
			{
				System.out.println(i + " Student : Rollno => " + d.rollno + "\tName => " + d.name + "\n");
				i++;
			}
			hs.clear();
			if(!hs.isEmpty())
			{
				for(deep d:hs)
				{
					System.out.println(i + " Student : Rollno => " + d.rollno + "\tName => " + d.name + "\n");
					i++;
				}
			}
			else
			{
				System.out.println("Sorry , This HashSet Is Empty !");
			}
	}
}
class deep
{
	int rollno;
	String name;
}