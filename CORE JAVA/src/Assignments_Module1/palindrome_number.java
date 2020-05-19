package Assignments_Module1;

import java.util.Scanner;

class palindrome
{
	int n,rem=0,rev=0,main;
	Scanner sc=new Scanner(System.in);
	void proceed1()
	{
		System.out.println("Enter the Any Number :");
		n=sc.nextInt();
		main=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev == main)
		{
			System.out.println(main + " => This number is Palindrome Number !");
		}
		else
		{
			System.out.println(main + " => This number is Not Palindrome Number !");
		}
	}
}

public class palindrome_number {

	public static void main(String[] args) {
		
		palindrome p1=new palindrome();
		p1.proceed1();

	}

}
