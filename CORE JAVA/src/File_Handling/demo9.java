/*Write a java program which read .java file and create
same other .java file*/
package File_Handling;
import java.io.*;
class demo9
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream FIS1=new FileInputStream("demo5.java");
		int i;
		while((i=FIS1.read()) != -1)
		{
			System.out.print((char)i);
		}
		FileOutputStream FOS2=new FileOutputStream("example.java");
			FileInputStream FIS2=new FileInputStream("example.java");
			String str="Hello....Health Is Wealth !";
			byte b[]=str.getBytes();
			FOS2.write(b);
			while((i=FIS2.read()) != -1)
			{
				System.out.print((char)i);
			}
	}
}