package Assignments_Module2;

import java.util.Scanner;

public class exception_handling_concept1 {

	public static void main(String[] args) {
		
		int no1,no2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number 1 =>");
		no1=sc.nextInt();
		System.out.println("Enter the Number 2 =>");
		no2=sc.nextInt();
		try
		{
			if(no1 == 0 || no2 == 0)
			{
				throw new ArithmeticException();
			}
			else
			{
				int ans;
				ans=no1/no2;
				System.out.println("Division Of Both This Numbers Is => " + ans);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
	}

}
