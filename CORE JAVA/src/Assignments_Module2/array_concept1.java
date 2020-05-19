package Assignments_Module2;

import java.util.Scanner;

class concept1
{
	int n=20;
	int i,count=0,count1=0,sum=0,sum1=0;
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
		for(i=0;i<n;i++)
		{
			System.out.println("a[" + (i+1) + "] => " + a[i]);
		}
		for(i=0;i<n;i++)
		{
			if(a[i] % 2 ==0)
			{
				count++;
				sum=sum+a[i];
			}
			else
			{
				count1++;
				sum1=sum1+a[i];
			}
		}
		System.out.println(count + " => Numbers Of Even Numbers !");
		System.out.println(count1 + " => Numbers Of Odd Numbers !");
		System.out.println("Sum of All Even Numbers Is => " + sum);
		System.out.println("Sum of All Odd Numbers Is => " + sum1);
	}
}

public class array_concept1 {

	public static void main(String[] args) {
		
		concept1 c1=new concept1();
		c1.getdata();
		c1.display();
		
	}

}
