package Assignments_Module2;

import java.util.Scanner;

class loop_concept1
{
	Scanner sc=new Scanner(System.in);
	int n;
	int i=1,sum=0;
	void proceed1()
	{
		System.out.println("Enter The Limit :");
		n=sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			System.out.println(sum);
			i++;
		}
	}
	
}

public class do_while_concept1 {
	public static void main(String[] args) {
		
		loop_concept1 lc1=new loop_concept1();
		lc1.proceed1();
	}
}
