package Assignments_Module1;

import java.util.Scanner;

class concept1
{
	Scanner sc=new Scanner(System.in);
	void calculate1()
	{
		System.out.println("Enter The Any String :");
		String s=sc.nextLine();
		
		int length=s.length();
		System.out.println(length + " => Length Of This String !");
		
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
	}
}

public class string_concept1 {

	public static void main(String[] args) {
		
		concept1 c1=new concept1();
		c1.calculate1();

	}

}
