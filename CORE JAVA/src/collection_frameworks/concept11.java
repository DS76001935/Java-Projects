package collection_frameworks;
import java.util.*;
class concept11
{
	static int size,i;
	public static void main(String args[])
	{
		HashSet<demo> hs=new HashSet<demo>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size Of Elements =>");
		size = sc.nextInt();
		for (i = 0; i < size; i++)
		{
			demo d1=new demo();
			System.out.print("Enter Your Rollno =>");
			d1.rollno=sc.nextInt();
			System.out.print("Enter Your Name =>");
			sc.nextLine();
			d1.name=sc.nextLine();
			hs.add(d1);
		}
		int i=1;
		for(demo d:hs)
		{
			System.out.println(i + " Student : Rollno => " + d.rollno + "\tName => " + d.name + "\n");
			i++;
		}
	}
}
class demo
{
	int rollno;
	String name;
}