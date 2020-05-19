package File_Handling;
import java.io.*;
class example1 implements Serializable
{
	int rollno,age;
	String name,address;
	example1(int rollno,String name,int age,String address)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.address=address;
	}
}

public class demo10
{
	public static void main(String args[]) throws IOException
	{
		example1 e1=new example1(48,"Deep Shah",20,"Ahmedabad");
		FileOutputStream FOS = new FileOutputStream("file1.txt");
		ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		OOS.writeObject(e1);
		OOS.flush();
		OOS.close();
		FileInputStream FIS = new FileInputStream("file1.txt");
		ObjectInputStream OIS = new ObjectInputStream(FIS);
		int i;
		try
		{
			example1 e2=(example1)OIS.readObject();
			System.out.println("Your Rollno =>" + e2.rollno);
			System.out.println("Your Full Name =>" + e2.name);
			System.out.println("Your Age =>" + e2.age);
			System.out.println("Your Address =>" + e2.address);
			OIS.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.toString());
		}
	}
}