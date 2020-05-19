package File_Handling;
import java.io.*;
import java.util.*;
class demo2
{
	public static void main(String args[]) throws IOException
	{
		int i;
		String name;
		File f2=new File("C:/Users/Hiiiiiii/Desktop/JAVA CAREER TRAINING COURSE/File_Handling/All_Files/file2.txt");
		FileOutputStream FOS=new FileOutputStream(f2);
		FileInputStream FIS=new FileInputStream(f2);
		Scanner sc=new Scanner(System.in);
		if(f2.exists())
		{
			System.out.println("This File Is Exist !");
			System.out.println("Enter Your Full Name =>");
			name=sc.nextLine();
			byte b[]=name.getBytes();
			System.out.println("\nAll Contents Of This File =>");
			FOS.write(b);
			while((i=FIS.read()) != -1)
			{
				System.out.print((char)i);
			}
		}
		else
		{
			System.out.println("Sorry This File Is Not Exist !");
		}
	}
}