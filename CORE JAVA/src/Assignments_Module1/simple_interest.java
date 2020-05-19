package Assignments_Module1;

import java.util.Scanner;

class interest
{
	int p,r,n,ans;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.print("Enter the Value of P :");
		p=sc.nextInt();
		System.out.print("Enter the Value of r :");
		r=sc.nextInt();
		System.out.print("Enter the Value of n :");
		n=sc.nextInt();
		
	}
	void result()
	{
		ans=(p*r*n/100);
		
		System.out.println("Simple Interest Is =>" + ans);
	}
}

public class simple_interest {

	public static void main(String[] args) {
		
		interest i1=new interest();
		i1.getdata();
		i1.result();
	}

}
