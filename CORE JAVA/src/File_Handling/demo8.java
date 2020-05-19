/*Write a java program to read first file and write in
second file.*/
package File_Handling;
import java.io.*;
class demo8
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream FOS1=new FileOutputStream("file4.txt");
		FileInputStream FIS1=new FileInputStream("file4.txt");
		FileOutputStream FOS2=new FileOutputStream("file5.txt");
		FileInputStream FIS2=new FileInputStream("file5.txt");
		String str="Hiii , I Am a Superstar !";
		byte b[]=str.getBytes();
		FOS1.write(b);
		int i;
		System.out.println();
		System.out.println("THIS IS A FIRST FILE (file4.txt) =>");
		System.out.println();
		while((i=FIS1.read()) != -1)
		{
			System.out.print((char)i);
			FOS2.write((char)i);
		}
		System.out.println();
		System.out.println();
		System.out.println("THIS IS A SECOND FILE (file5.txt) FROM FIRST FILE (file4.txt) =>");
		System.out.println();
		while((i=FIS2.read()) != -1)
		{
			System.out.print((char)i);
		}
	}
}