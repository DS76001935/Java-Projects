package concept_of_positive_nagetive;

import java.util.Scanner;

class pos_neg2
{
	int n=50,i;
	int a[]=new int[n];
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.print("How May Elements You Can Enter ?");
		n=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the Number " + (i+1) + " =>");
			a[i]=sc.nextInt();
		}
		
	}
	void result()
	{
		for(i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				System.out.println(a[i] + " => Positive Number !");
			}
			else if (a[i]<0)
			{
				System.out.println(a[i] + " => Nagetive Number !");
			}
			else
			{
				System.out.println(a[i] + " => Zero Number Means Nothing !");
			}
		}
	}
}

public class concept2 {

	public static void main(String[] args) {
		
		pos_neg2 p2=new pos_neg2();
		p2.getdata();
		p2.result();

	}

}
