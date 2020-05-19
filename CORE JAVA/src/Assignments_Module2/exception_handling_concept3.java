package Assignments_Module2;

import java.util.Scanner;

class person extends Exception
{
	int age;
	person(int age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "Sorry , Your Age Is Less Than OR Equals To 18 ,\n So You Are Not Eligible For Voting !";
	}
}

public class exception_handling_concept3 {
		static boolean flag;
		public static void process1()
		{
			if(flag == true)
			{
				System.out.println("Congratulations , Your Age Is Greater Than 18 ,\n So You Are Eligible For Voting !");	
			}
	}
	
	public static void main(String[] args) {
		
		String name;
		long mno;
		int age;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Your Full Name =>");
			name=sc.nextLine();
			System.out.println("Enter Your Real Age =>");
			age=sc.nextInt();
			System.out.println("Enter Youyr Official Phone Number =>");
			mno=sc.nextLong();
			if(age > 18)
			{
				flag=true;
				process1();
			}
			else
			{
				flag=false;
				throw new person(age);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("\n\nYour Conformation Is Completed !");
		}
	}

}