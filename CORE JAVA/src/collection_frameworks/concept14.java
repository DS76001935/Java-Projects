package collection_frameworks;
import java.util.Scanner;
import java.util.Stack;

interface stack
{
	void PUSH();
	void POP();
}

class myStack implements stack
{
	int size,value2;
	Scanner sc=new Scanner(System.in);
	Stack st=new Stack();
	Stack tmp=new Stack();
	public void PUSH()
	{
		
		System.out.print("Enter the Size For PUSH OPERATION =>");
		size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter the Value =>");
			st.push(sc.nextInt());
		}
	}
	void DisplayElements1()
	{
		System.out.println("All Elements Of This Stack Is => " + st);
	}
	void DisplayElements2()
	{
		System.out.println("Now , Finally All Elements Of Our Original Stack Is => " + st);
	}
	public void POP()
	{
		System.out.print("Enter the Value FOR POP=>");
		value2=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			Integer a=(Integer)st.pop();
			if(value2 == a)
			{
				System.out.println("Your Number Was Completely Deleted In This Stack !");
				break;
			}
			else
			{
				tmp.push(a);
			}
		}
		int size1=tmp.size();
		System.out.println("Original Stack Is =>" + st);
		System.out.println("Size Of Our Original Stack Is => " + st.size());
		System.out.println("Tamporary Stack Is =>" + tmp);
		System.out.println("Size Of This Tamporary Stack Is => " + size1);
		for(int i=0;i<size1;i++)
		{
			Integer b=(Integer)tmp.pop();
			st.push(b);
		}
	}
}

public class concept14{

	public static void main(String[] args) {
		
		myStack ms1=new myStack();
		ms1.PUSH();
		ms1.DisplayElements1();
		ms1.POP();
		ms1.DisplayElements2();
	}

}
