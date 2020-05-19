package concept_of_exception_handling;

import java.util.Scanner;

class demo1
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	void process1()
	{
		try
		{
			System.out.println("Enter the value of A :");
			a=sc.nextInt();
			System.out.println("Enter the value of B :");
			b=sc.nextInt();
			if(a>0 && b>0)
			{
				c=(a/b);
				System.out.println("Division of Both Value A And B :" + c);
			}
			else
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Caught !");
		}
		finally
		{
			System.out.println("Rest of the code !");
		}
		
	}
}

public class concept1 {

	public static void main(String[] args) {
		
		demo1 d1=new demo1();
		d1.process1();

	}

}
