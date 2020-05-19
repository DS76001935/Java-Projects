package collection_frameworks;
import java.util.ArrayList;
import java.util.Scanner;

public class concept1 {
	static int bca;
	static int bcom;
	static int bba;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		ArrayList arr=new ArrayList();
		System.out.print("Enter The Admissions Of How Many Students =>");
		int size=sc.nextInt();
		sc.nextLine();
		for(i=0;i<size;i++)
		{
			System.out.print("Enter the Admission of " + (i+1) + "Student =>");
			String admission=sc.nextLine();
			arr.add(admission);
		}
		System.out.println("Total Admissions Of GLS UNIVERSITY =>");
		for(i=0;i<arr.size();i++)
		{
			System.out.println((i+1) + "  Student's Admission =>" + arr.get(i));
			if(arr.get(i).equals("bca"))
			{
				bca++;
			}
			else if(arr.get(i).equals("bba"))
			{
				bba++;
			}
			else if(arr.get(i).equals("bcom"))
			{
				bcom++;
			}
		}
		System.out.println("Total Numbers Of Admission In BCA Field => " + bca);
		System.out.println("Total Numbers Of Admission In BBA Field => " + bba);
		System.out.println("Total Numbers Of Admission In BCOM Field => " + bcom);
	}

}
