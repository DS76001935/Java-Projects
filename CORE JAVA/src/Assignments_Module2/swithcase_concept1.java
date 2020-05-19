package Assignments_Module2;

import java.util.Scanner;

class switchcase
{
	int no1,no2;
	String op;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter The Any 1ST Number :");
		no1=sc.nextInt();
		System.out.println("Enter The Any 2ND Number :");
		no2=sc.nextInt();
	}
	void print()
	{
		System.out.println("Your First Number :" + no1);
		System.out.println("Your Second Number :" + no2);
	}
	void find()
	{
		System.out.println("---------------------------------MENU Driven-----------------------------");
		System.out.println("If You Can Try Addition Of This Two Numbers So Press '+' Operator :");
		System.out.println("If You Can Try Subtraction Of This Two Numbers So Press '-' Operator :");
		System.out.println("If You Can Try Multiplication Of This Two Numbers So Press '*' Operator :");
		System.out.println("If You Can Try Division Of This Two Numbers So Press '/' Operator :");
		System.out.println("If You Can Try Moduls Of This Two Numbers So Press '%' Operator :");
		System.out.println("Enter Your Any Operator To Perform Some Operation :");
		op=sc.next();
		switch(op)
		{
			case "+" :
				int sum=0;
				sum=no1+no2;
				System.out.println("Addition Of This Two Values Is =>" + sum);
				break;
			case "-" :
				int sub=0;
				sub=no1-no2;
				System.out.println("Subtraction Of This Twoi Values Is => " + sub);
				break;
			case "*" :
				int mul=1;
				mul=no1*no2;
				System.out.println("Multiplication Of This Two Values Is => " + mul);
				break;
			case "/" :
				System.out.println("Division of This Two Values Is => " + (no1 / no2));
				break;
			case "%" :
				System.out.println("Moduls Between This Two Values Is => " + (no1 % no2));
				break;
			default :
				System.out.println("Sorry , Invalid Option !");
				break;
		}
	}
}

public class swithcase_concept1 {

	public static void main(String[] args) {
		
		switchcase s=new switchcase();
		s.getdata();
		s.print();
		s.find();

	}

}
