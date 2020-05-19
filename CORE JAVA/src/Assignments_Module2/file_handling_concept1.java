package Assignments_Module2;
import java.io.*;
import java.util.Scanner;

public class file_handling_concept1 {

	public static void main(String[] args) throws Exception {
		
		File F=new File("C:\\Users\\Hiiiiiii\\Desktop\\JAVA CAREER TRAINING COURSE\\eclipse-workspace\\CORE JAVA\\src\\Assignments_Module2","a.txt");
		FileOutputStream FOS=new FileOutputStream(F);
		FileInputStream FIS=new FileInputStream(F);
		DataOutputStream DOS=new DataOutputStream(FOS);
		DataInputStream DIS=new DataInputStream(FIS);
		
		String name;
		int age;
		long mno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Full Name =>");
		name=sc.nextLine();
		System.out.println("Enter Your Age =>");
		age=sc.nextInt();
		System.out.println("Enter Your Mobile Number =>");
		mno=sc.nextLong();
		DOS.writeUTF(name);
		DOS.writeInt(age);
		DOS.writeLong(mno);
		String i;
		int j;
		long k;
		while((i=DIS.readUTF()) != null)
		{
			System.out.print(i);
		}
		while((j=DIS.readInt()) != -1)
		{
			System.out.print(j);
		}
		while((k=DIS.readLong()) != -1)
		{
			System.out.print(k);
		}
	}

}
