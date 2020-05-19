package Assignments_Module2;

import java.util.Scanner;

class student
{
	int n=5,i;
	int total=0;
	int per;
	int marks[]=new int[n];
	int no,age;
	String name;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter Your Rollno :");
		no=sc.nextInt();
		System.out.println("Enter Your Name :");
		sc.nextLine();
		name=sc.nextLine();
		System.out.println("Enter Your Age :");
		age=sc.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.print("Enter the Marks[" + (i+1) + "] => ");
			marks[i]=sc.nextInt();
		}
	}
	void display()
	{
		System.out.println("Your Rolno => " + no);
		System.out.println("Your Name => " + name);
		System.out.println("Your Age => " + age);
		System.out.println("This is List Of Marks About 5 subjects :");
		for(i=0;i<n;i++)
		{
			System.out.println("marks of " + (i+1) + " Subject =>"+ marks[i]);
		}
		System.out.println("Total Of All Your Marks Is =>" + total);
		System.out.println("Your Persantage Is =>" + per + "%");
	}
	void calculation()
	{
		for(i=0;i<n;i++)
		{
			total=total+marks[i];
		}
		per=total/n;
	}
	void check()
	{
		if(per<40)
		{
			System.out.println("You Are Fail !");
		}
		else if(per>=50 && per <60)
		{
			System.out.println("You can have Pass Class !");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("You can have First Class !");
		}
		else if(per>=75)
		{
			System.out.println("You can have First Class With Distinction !");
		}
	}
}

public class check_marks_grades_elseifladder {

	public static void main(String[] args) {
		
		student s1=new student();
		s1.getdata();
		s1.calculation();
		s1.display();
		s1.check();

	}

}
