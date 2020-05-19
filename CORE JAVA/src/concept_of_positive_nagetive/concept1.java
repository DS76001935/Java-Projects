package concept_of_positive_nagetive;

import java.util.Scanner;

class pos_neg1
{
	int no;
	Scanner sc=new Scanner(System.in);
	void getdata()
	{
		System.out.print("Enter the Any Value :");
		no=sc.nextInt();
	}
	void result()
	{
		if(no>0)
		{
			System.out.println("This Number Is Positive Number !");
		}
		else if(no<0)
		{
			System.out.println("This Number Is Nagetive Number !");
		}
		else
		{
			System.out.println("Nothing !");
		}
	}
}

public class concept1 {

	public static void main(String[] args) {

		pos_neg1 p1=new pos_neg1();
		p1.getdata();
		p1.result();
	}

}
