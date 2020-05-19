package concept_of_even_odd;

import java.util.Scanner;

public class concept3 {

	
	public static void main(String[] args) {
		int n=20,i;
		int a[]=new int[n];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Linit for Elements of Array :");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the " + (i+1) + " Number :");
			a[i]=sc.nextInt();
		}
		System.out.println("All Values : ");
		for(i=0;i<n;i++)
		{
			if(a[i] % 2 == 0)
			{
				System.out.println(a[i] + " => Even Number !");
			}
			else
			{
				System.out.println(a[i] + " => Odd Number !");
			}
		}

	}

}
