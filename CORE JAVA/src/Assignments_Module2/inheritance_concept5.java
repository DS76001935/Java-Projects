package Assignments_Module2;

import java.util.HashMap;
import java.util.Scanner;

class player
{
	int age;
	String  name;
	Scanner sc=new Scanner(System.in);
	void setdata()
	{
		System.out.println("Enter Your Name =>");
		name=sc.nextLine();
		System.out.println("Enter Your Age =>");
		age=sc.nextInt();
	}
	void show()
	{
		System.out.println("Your Name Is =>" + name);
		System.out.println("Your Age Is =>" + age);
	}
}
class batsmen extends player
{
	long runs;
	void setdata()
	{
		super.setdata();
		System.out.println("Enter Your Total Runs =>");
		runs=sc.nextLong();
	}
	void show()
	{
		super.show();
		if(runs>500)
		{
			System.out.println("Your Total Runs Is =>" + runs);
			System.out.println("Congo , You Are a Eligible For Become a Successfull Batsmen !");
		}
		else
		{
			System.out.println("Sorry , You Are Not Eligible For Become a Successfull Batsmen !");
		}
	}
}
class bolwer extends player
{
	int wickets;
	void setdata()
	{
		System.out.println("Enter Your Total Wickets =>");
		wickets=sc.nextInt();
	}
	void show()
	{
		if(wickets>50)
		{
			System.out.println("Your Total Wickets Is =>" + wickets);
			System.out.println("Congo , You Are a Eligible For Become a Successfull Bolwer !");
		}
		else
		{
			System.out.println("Sorry , You Are Not Eligible For Become a Successfull Bolwer !");
		}
	}
}

public class inheritance_concept5 
{
	
	public static void main(String[] args) {
		
		batsmen b1=new batsmen();
		bolwer b2=new bolwer();
		b1.setdata();
		b2.setdata();
		b1.show();
		b2.show();
	}
}