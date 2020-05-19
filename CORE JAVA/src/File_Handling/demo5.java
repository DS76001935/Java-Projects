/*Write a java program that generates 10 random
double numbers and store them in a file. Read the
file and display the numbers, sum, avg, max and
min.*/
package File_Handling;
import java.io.*;
class demo5
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream FOS=new FileOutputStream("file4.txt");
		DataOutputStream DOS=new DataOutputStream(FOS);
		FileInputStream FIS=new FileInputStream("file4.txt");
		DataInputStream DIS=new DataInputStream(FIS);
		double i,sum=0,max=0,min=0;
		for(i=1;i<=10;i++)
		{
			DOS.writeDouble(i);
			sum=sum+i;
			if(DIS.readDouble() != -1)
			{
				System.out.println(i);
			}
		}
		max=Math.max(1,10);
		min=Math.min(1,10);
		double avg=(sum/10);
		//int j;
		System.out.println("Total Of this 10 Numbers =>" + sum);
		System.out.println("Average Of this 10 Numbers =>" + avg);
		System.out.println("Maximum Numbers Between This Random Numbers =>" + max);
		System.out.println("Minimum Numbers Between This Random Numbers =>" + min);
	}
}