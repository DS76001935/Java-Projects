package concept_of_max_min;

import java.util.Scanner;

class max_min1
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.print("Enter the Value of A :");
		a=sc.nextInt();
		System.out.print("Enter the Value of B :");
		b=sc.nextInt();
		System.out.print("Enter the Value of C :");
		c=sc.nextInt();
	}
	void result()
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Greater Than B And C !");
			}
			else
			{
				System.out.println("C is Greater Than A And B!");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is Greater Than A And C !");
			}
			else
			{
				System.out.println("C is Greater Than A And B!");
			}
		}
	}
}

public class concept2 {

	public static void main(String[] args) {
		
		max_min1 m1=new max_min1();
		m1.getdata();
		m1.result();
		
	}

}
