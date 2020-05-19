package concept_of_even_odd;

import java.util.Scanner;

public class concept2 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no,i=1;
		
		System.out.print("Enter the Limit :");
		no=sc.nextInt();
		
		while(i<=no)
		{
			if(i % 2 == 0)
			{
				System.out.println(i + " => Even number !");
			}
			else
			{
				System.out.println(i + " => Odd number !");
			}
			i++;
		}

	}

}
