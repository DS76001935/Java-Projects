package concept_of_even_odd;

import java.util.Scanner;

public class concept1 {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no;
		
		System.out.print("Enter the number :");
		no=sc.nextInt();
		if(no % 2 == 0)
		{
			System.out.println(no + " => This is a Even Enumber");
		}
		else
		{
			System.out.println(no + " => This is a Odd Enumber");
		}
	}
}
