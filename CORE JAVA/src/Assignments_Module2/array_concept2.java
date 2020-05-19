package Assignments_Module2;

import java.util.Scanner;

class concept2
{
	int n=20;
	int i;
	int a[]=new int[n];
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.println("How Many Elements you may Enter? ");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the a[" + (i+1) + "] => ");
			a[i]=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println("Asceding Order Of This Array :");
		for(i=0;i<n;i++)
		{
			System.out.println("a[" + (i+1) + "] => " + a[i]);
		}
		System.out.println("Desceding Order Of This Array :");
		for(i=n-1;i>=0;i--)
		{
			System.out.println("a[" + (i+1) + "] => " + a[i]);
		}
	}
}

public class array_concept2 {

	public static void main(String[] args) {
		
		concept2 c2=new concept2();
		c2.getdata();
		c2.display();

	}

}
