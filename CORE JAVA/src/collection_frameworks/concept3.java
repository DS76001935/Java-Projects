package collection_frameworks;
import java.util.ArrayList;
import java.util.Scanner;

class demo2 {
	int rollno, age;
	String name, address;
	long contactno;
}

public class concept3 {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<demo2> AL = new ArrayList();

	public static void operation() {
		boolean exit=false;
		int op, i, size,k;
		do {
			if (exit == false)
			{
				System.out.println("----------------------------------");
				System.out.println("Student Application !");
				System.out.println("1) Insert Student's All Details !");
				System.out.println("2) View Student's All Details !");
				System.out.println("3) Update Student's All Details !");
				System.out.println("4) Delete Student's All Details !");
				System.out.println("5) EXIT !");
				System.out.println("----------------------------------");
				System.out.print("Enter The Any Choice =>");
				op = sc.nextInt();
	
				switch (op) {
				case 1:
					System.out.println("#INSERTION#");
					System.out.println("Enter the Size Of Elements =>");
					size = sc.nextInt();
					for (i = 0; i < size; i++) {
						demo2 d2 = new demo2();
						System.out.println("Enter The " + (i + 1) + " Student Details =>");
						System.out.println("Enter ROLL NO Of " + (i + 1) + " Student =>");
						d2.rollno = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter NAME Of " + (i + 1) + " Student =>");
						d2.name = sc.nextLine();
						System.out.println("Enter AGE Of " + (i + 1) + " Student =>");
						d2.age = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter ADDRESS Of " + (i + 1) + " Student =>");
						d2.address = sc.nextLine();
						System.out.println("Enter CONTACT NO Of " + (i + 1) + " Student =>");
						d2.contactno = sc.nextLong();
						AL.add(d2);
					}
	
					break;
				case 2:
					System.out.println("Enter The Any Index Number =>");
					k = sc.nextInt();
					if (k < AL.size())
					{
						System.out.println("#VIEW ALL STUDENT DETAILS#");
						System.out.println((k + 1) + " Student's All Details => ");
						for (i = k; i <= k; i++)
						{
							System.out.println("\nROLLNO => " + AL.get(k).rollno + "\nNAME => " + AL.get(k).name + "\nAGE => "
								+ AL.get(k).age + "\nADDRESS => " + AL.get(k).address + "\nCONTACT NO => "
								+ AL.get(k).contactno);
						}
					}
					else
					{
						System.out.println("Sorry, This Index Is Not Exist !");
					}
					break;
				case 3:
						update();
						break;
				case 4:
					String op2;
					int j;
					System.out.println("#DELETION#");
					System.out.println("Enter The Any Index Number =>");
					j = sc.nextInt();
					if (j < AL.size()) {
						AL.remove(j);
						System.out.println("Deletion Was Successfull !");
					} else {
						System.out.println("Sorry , This Index Is Out Of Bound !");
					}
					break;
				case 5:
					exit=true;
				}
			}
			else
			{
				break;
			}
		} while (op != 5);
	}

	public static void update() {
		boolean exit1=false;
		String op1 = null;
		Scanner sc = new Scanner(System.in);
		int k;
		System.out.println("#UPDATION#");
		System.out.println("Enter The Any Index Number =>");
		k = sc.nextInt();
		if (k < AL.size()) {

			do {
				if(exit1==false)
				{
						System.out.println("------------------------------------------");
						System.out.println("If You Update ROLLNO Than Press U1 !");
						System.out.println("If You Update NAME Than Press U2 !");
						System.out.println("If You Update AGE Than Press U3 !");
						System.out.println("If You Update ADDRESS Than Press U4 !");
						System.out.println("If You Update CONTACT NO Than Press U5 !");
						System.out.println("If You Update Whole Index Than Press U6 !");
						System.out.println("If You Can Exit Than Press U7 !");
						System.out.println("------------------------------------------");
						System.out.println("Enter The Any Choice =>");
						op1 = sc.next();
	
						switch (op1) {
						case "U1":
							System.out.println("Enter The Any Rollno To You Have Update =>");
							AL.get(k).rollno = sc.nextInt();
							break;
						case "U2":
							System.out.println("Enter The Any Name To You Have Update =>");
							sc.nextLine();
							AL.get(k).name = sc.nextLine();
							break;
						case "U3":
							System.out.println("Enter The Any Age To You Have Update =>");
							AL.get(k).age = sc.nextInt();
							break;
						case "U4":
							System.out.println("Enter The Any Address To You Have Update =>");
							sc.nextLine();
							AL.get(k).address = sc.nextLine();
							break;
						case "U5":
							System.out.println("Enter The Any Contact No To You Have Update =>");
							AL.get(k).contactno = sc.nextLong();
							break;
						case "U6":
							demo2 d3 = new demo2();
							System.out.println("Please , Now You can Do Update The Whole Index !");
							System.out.println("Update The ROLL NO Of " + (k + 1) + " Student =>");
							d3.rollno = sc.nextInt();
							sc.nextLine();
							System.out.println("Update The NAME Of " + (k + 1) + " Student =>");
							d3.name = sc.nextLine();
							System.out.println("Update The AGE Of " + (k + 1) + " Student =>");
							d3.age = sc.nextInt();
							sc.nextLine();
							System.out.println("Update The ADDRESS Of " + (k + 1) + " Student =>");
							d3.address = sc.nextLine();
							System.out.println("Update The CONTACT NO Of " + (k + 1) + " Student =>");
							d3.contactno = sc.nextLong();
							AL.set(k, d3);
							break;
						case "U7":
	                           exit1=true;
						}
				}
				else
				{
					break;
				}
			} while (op1 != "U7");
		} else {
			System.out.println("Sorry , This Index Is Out Of Bound !");
		}
	}

	public static void main(String[] args) {
		operation();
	}

}
