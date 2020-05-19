package concept_of_max_min;

import java.util.Scanner;

class max_min
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.print("Enter the Value of a :");
		a=sc.nextInt();
		System.out.print("Enter the Value of b :");
		b=sc.nextInt();
	}
	void result()
	{
		if(a>b)
		{
			System.out.println("A Is Greater !");
		}
		else
		{
			System.out.println("B is Greater !");
		}
	}
	
}
public class concept1 {

	public static void main(String[] args) {
		
		max_min m1=new max_min();
		m1.getdata();
		m1.result();

	}

}
