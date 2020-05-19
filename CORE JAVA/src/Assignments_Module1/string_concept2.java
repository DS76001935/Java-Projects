package Assignments_Module1;

import java.util.Scanner;

class concept2
{
	Scanner sc=new Scanner(System.in);
	void calculate2()
	{
		String s;
		int count=0;
		int count1=0;
		System.out.println("Enter the Any String :");
		s=sc.nextLine();
		System.out.println(s);
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a'
			   || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println(count + " => Numbers of Vowels In this String !");
		System.out.println(count1 + " => Numbers of Consonent In this String !");
	}
}

public class string_concept2 {

	public static void main(String[] args) {
		
		concept2 c2=new concept2();
		c2.calculate2();

	}

}
