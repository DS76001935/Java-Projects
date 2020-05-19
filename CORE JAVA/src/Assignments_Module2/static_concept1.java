package Assignments_Module2;

import java.util.Scanner;

class simpleclass
{
	Scanner sc=new Scanner(System.in);
	static int rollno;
	String name;
	void spacialmethod()
	{
		System.out.println("Enter Your Rollno :");
		rollno=sc.nextInt();
		System.out.println("Enter Your Name :");
		sc.nextLine();
		name=sc.nextLine();
	}
	void displaydata()
	{
		System.out.println("Rollno Is =>" + rollno + "  Name Is =>" + name);
	}
}

public class static_concept1 {

	public static void main(String[] args) {
		int count=0;
		simpleclass simple1=new simpleclass();
		count++;
		simpleclass simple2=new simpleclass();
		count++;
		simpleclass simple3=new simpleclass();
		count++;
		System.out.println("Numbers Of Objects Is =>" + count);
		System.out.println("For First Object =>");
		simple1.spacialmethod();
		simple1.displaydata();
		simple2.displaydata();
		simple3.displaydata();
		System.out.println("For Second Object =>");
		simple2.spacialmethod();
		simple1.displaydata();
		simple2.displaydata();
		simple3.displaydata();
		System.out.println("For Third Object =>");
		simple3.spacialmethod();
		simple1.displaydata();
		simple2.displaydata();
		simple3.displaydata();
	}

}
