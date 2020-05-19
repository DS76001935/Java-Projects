/*Write a java program that writes first 10 Fibonacci
series numbers to the file using writeShort()
method. By using readShort() method read the file
and display the numbers. The name of the file
should be given from command line.*/
package File_Handling;
import java.io.*;
import java.util.*;
class demo4
{
	public static void main(String args[]) throws IOException
	{
		File f1 = new File("C:/Users/Hiiiiiii/Desktop/JAVA CAREER TRAINING COURSE/File_Handling");
		String name=args[0];
		File f2=new File(f1,name);
		boolean bool=f2.exists();
		if(bool == true)
		{
			FileOutputStream FOS=new FileOutputStream(f2);
			DataOutputStream DOS=new DataOutputStream(FOS);
			FileInputStream FIS=new FileInputStream(f2);
			DataInputStream DIS=new DataInputStream(FIS);
			System.out.println("Congratulation , This File Is Exist !");
			short n1=0,n2=1,n3,limit;
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter Your Limit =>");
			limit=Sc.nextShort();
			System.out.println(n1 + "  " + n2);
			for(short i=2;i<limit;i++)
			{
				n3=Short.parseShort(null, n1 + n2);
				System.out.println("  " + n3);
				n1=n2;
				n2=n3;
				DOS.writeShort(n3);
			}
		}
		else
		{
			System.out.println("Sorry , This File Is Not Exist !");
		}
	}
}