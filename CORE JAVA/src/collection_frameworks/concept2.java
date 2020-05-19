package collection_frameworks;
import java.util.ArrayList;
import java.util.Scanner;

class demo1
{
	int id;
	String name;
}

 class concept2 {

	public static void main(String[] args) {
		demo1 d1=new demo1();
		int i;
		ArrayList<demo1> AL = new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size Of Elements =>");
		int size=sc.nextInt();
		for(i=0;i<size;i++)
		{
			System.out.println("Enter the " + (i+1) + " Student Details =>");
			System.out.println("Enter ID Of " + (i+1) + " Student =>");
			d1.id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter NAME Of " + (i+1) + " Student =>");
			d1.name=sc.nextLine();
			AL.add(d1);
		}
		System.out.println("ALl Details Of Students =>");
		for(i=0;i<AL.size();i++)
		{
			System.out.println("ID =>" + AL.get(i).id + " \nAnd\nNAME " +  AL.get(i).name);
		}
		AL.remove(d1);
	}

}
