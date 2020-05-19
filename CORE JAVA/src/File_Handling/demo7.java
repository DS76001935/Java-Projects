/*Write a java program to read two different file and
merge in single third file.*/
package File_Handling;
import java.io.*;
class demo7
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream FOS1=new FileOutputStream("file1.txt");
		FileInputStream FIS1=new FileInputStream("file1.txt");
		FileOutputStream FOS2=new FileOutputStream("file2.txt");
		FileInputStream FIS2=new FileInputStream("file2.txt");
		FileOutputStream FOS3=new FileOutputStream("file3.txt");
		FileInputStream FIS3=new FileInputStream("file3.txt");
		String str1="My Name Is Deep Shah !";
		String str2="I Am Studing In GLS UNIVERSITY !";
		byte b1[]=str1.getBytes();
		byte b2[]=str2.getBytes();
		FOS1.write(b1);
		FOS2.write(b2);
		int i;
		System.out.println();
		System.out.println("THIS IS A FIRST FILE =>");
		System.out.println();
		while((i=FIS1.read()) != -1)
		{
			System.out.print((char)i);
			FOS3.write((char)i);
		}
		System.out.println();
		System.out.println();
		System.out.println("THIS IS A SECOND FILE =>");
		System.out.println();
		while((i=FIS2.read()) != -1)
		{
			System.out.print((char)i);
			FOS3.write((char)i);
		}
		System.out.println();
		System.out.println();
		System.out.println("THIS IS A THIRD FILE MERGED WITH FILE 1 AND FILE 2 =>");
		System.out.println();
		while((i=FIS3.read()) != -1)
		{
			System.out.print((char)i);
		}
	}
}