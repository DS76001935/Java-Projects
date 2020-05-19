package Assignments_Module1;

import java.util.Scanner;

class prime
{
	int i,n;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.print("Enter Your Any Number :");
		n=sc.nextInt();
	}
	void prime_process()
	{
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				break;
			}
		}
		if(i==n)
		{
			System.out.println(n + " => This Number is Prime Number ! ");
		}
		else
		{
			System.out.println(n + " => This Number is Not Prime Number ! ");
		}
	}
}

public class prime_number {

	public static void main(String[] args) {
		
		prime p1=new prime();
		p1.getdata();
		p1.prime_process();

	}

}
