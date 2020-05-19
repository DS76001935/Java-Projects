package File_Handling;
import java.io.*;
import java.util.*;
class demo3
{
	public static void main(String args[]) throws IOException
	{
		int i;
		RandomAccessFile RAF=new RandomAccessFile("file3.txt","rw");
		for(i=1;i<=10;i++)
		{
			RAF.writeInt(i);
		}
		RAF.seek(10);
		System.out.println("Last Value  =>" + RAF.getFilePointer());
	}
}