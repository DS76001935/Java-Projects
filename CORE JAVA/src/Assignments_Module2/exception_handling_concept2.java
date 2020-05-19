package Assignments_Module2;

import java.util.Scanner;

class error1 extends Exception
{
	static String msg;
	error1(String msg)
	{
		this.msg=msg;
	}
	public String toString()
	{
		return "Please , Enter Your Limit Only In Greater Than 10 And Less Than 40 !";
	}
}

public class exception_handling_concept2
{
	public static void main(String[] args) {
		
		int no;
		String str = null;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Your Limit =>");
			no=sc.nextInt();
			if(no > 10 && no < 40)
			{
				for(int i=1;i<=no;i++)
				{
					System.out.println(i);
				}
			}
			else
			{
				throw new error1(str);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("End Of The Program !");
		}
	}

}
