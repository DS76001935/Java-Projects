package concept_of_max_min;

import java.util.Scanner;

class max_min2
{
	int n=50,i;
	int a[]=new int[n];
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.print("How Many Elements You Can Enter ?");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the Number " + (i+1) + " =>");
			a[i]=sc.nextInt();
		}
		
	}
	void displaydata()
	{
		System.out.println("All Values Of This Numbers Of Elements :");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
	void maximum_result()
	{
		int max=0;
		max=a[0];
		for(i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Value Of This Array Is =>" + max);
	}
	void minimum_result()
	{
		int min=0;
		min=a[0];
		for(i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Value Of This Array Is =>" + min);
	}
}

public class concept3 {

	public static void main(String[] args) {
		
		max_min2 m2=new max_min2();
		m2.getdata();
		m2.displaydata();
		m2.maximum_result();
		m2.minimum_result();
	}

}
