/*Write a java program that reads a text file and creates
a new text file with each letter converted to upper
case whether it is lower case or upper case.*/
package File_Handling;
import java.io.*;
class demo6
{
	public static void main(String args[]) throws IOException
	{
		String str="Hiii , My Name Is Deep Shah !";
		FileOutputStream FOS1=new FileOutputStream("file3.txt");
		FileInputStream FIS1=new FileInputStream("file3.txt");
		FileOutputStream FOS2=new FileOutputStream("file6.txt");
		FileInputStream FIS2=new FileInputStream("file6.txt");
		FileOutputStream FOS3=new FileOutputStream("file7.txt");
		FileInputStream FIS3=new FileInputStream("file7.txt");
		String stru=str.toUpperCase();
		String strl=str.toLowerCase();
		byte b1[]=str.getBytes();
		byte b2[]=stru.getBytes();
		byte b3[]=strl.getBytes();
		FOS1.write(b1);
		FOS2.write(b2);
		FOS3.write(b3);
		System.out.println();
		System.out.println("This String Of File3.txt (All CHARACTERS ARE IN NORMAL CASE) =>");
		int i;
		while((i=FIS1.read()) != -1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println();
		System.out.println("This String Of File6.txt (All CHARACTERS ARE IN UPPER CASE) =>");
		while((i=FIS2.read()) != -1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		System.out.println();
		System.out.println("This String Of File7.txt (All CHARACTERS ARE IN LOWER CASE) =>");
		while((i=FIS3.read()) != -1)
		{
			System.out.print((char)i);
		}
	}
}