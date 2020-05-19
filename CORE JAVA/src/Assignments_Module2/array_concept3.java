package Assignments_Module2;

import java.util.Scanner;

class concept3
{
	int n=20;
	int i;
	double array[]=new double [n];
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter The Any Value =>");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the " + (i+1) + " Element => ");
			array[i]=sc.nextDouble();
		}
	}
	void display()
	{
		System.out.println("All Elements Of This Array =>");
		for(i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
	}
}

public class array_concept3 {
	
	static concept3 c3=new concept3();
	static void average(double[] array1)
	{
		double sum=0.0;;
		for(c3.i=0;c3.i<c3.n;c3.i++)
		{
			sum=sum+array1[c3.i];
		}
		double avg=sum/c3.n;
		System.out.println(avg);
	}
	
	public static void main(String[] args) {
		
		c3.getdata();
		c3.display();
		System.out.println("Average Of This All Values Is =>");
		average(c3.array);
	}

}
