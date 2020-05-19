package Assignments_Module1;

import java.util.Scanner;

class fibo
{
	Scanner sc=new Scanner(System.in);
	int n1=0,n2=1,n3,i,limit;
	void getdata()
	{
		System.out.print("Enter Your Limit :");
		limit=sc.nextInt();
	}
	void process()
	{
		System.out.print(n1 + "  " + n2);
		for(i=2;i<limit;i++)
		{
			n3=n1+n2;
			System.out.print("  " + n3);
			n1=n2;
			n2=n3;
		}
	}
}

public class fibonaaci {

	public static void main(String[] args) {
		
		fibo f1=new fibo();
		f1.getdata();
		f1.process();

	}

}
