package Assignments_Module1;

import java.util.Scanner;

class arm
{
	Scanner sc=new Scanner(System.in);
	int n,rem=0,sum=0,main;
	void proceed()
	{
		System.out.println("Enter The Any Number :");
		n=sc.nextInt();
		main=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum +(rem*rem*rem);
			n=n/10;
		}
		if(sum==main)
		{
			System.out.println(main + " => This number is Armstrong Number !");
		}
		else
		{
			System.out.println(main + " => This number is Not Armstrong Number !");
		}
	}
}

public class armstrong_number {

	public static void main(String[] args) {
		
		arm a1=new arm();
		a1.proceed();

	}

}
