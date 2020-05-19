package concept_of_exception_handling;

import java.util.Scanner;

class demo2
{
	int rno,age;
	String sname;
	Scanner sc=new Scanner(System.in);
	void process2()
	{
		try
		{
			System.out.println("Enter Your Rollno :");
			rno=sc.nextInt();
			System.out.println("Enter Your Name :");
			sc.nextLine();
			sname=sc.nextLine();
			System.out.println("Enter Your Age :");
			age=sc.nextInt();
			throw new NumberFormatException();
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Exception Caught !");
			process2();
		}
	}
}

public class concept2 {

	public static void main(String[] args) {
		
		demo2 d2=new demo2();
		d2.process2();
	}

}
