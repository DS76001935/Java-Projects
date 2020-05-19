package Assignments_Module2;

abstract class Animals
{
	boolean flag=false;
	abstract void check();
	abstract void Eating(int i);
}
class lion extends Animals
{
	boolean flag;
	void check()
	{
		if(flag==true)
		{
			System.out.println("This Animal Is Eating !");
		}
		else if(flag==false)
		{
			System.out.println("This Animal Is Not Eating !");
		}
	}
	void Eating(int i)
	{
		if(i>0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		check();
	}
	
}
class tiger extends Animals
{
	boolean flag;
	void check()
	{
		if(flag==true)
		{
			System.out.println("This Animal Is Eating !");
		}
		else if(flag==false)
		{
			System.out.println("This Animal Is Not Eating !");
		}
	}
	void Eating(int i)
	{
		if(i>0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		check();
	}
	
}
class elephant extends Animals
{
	boolean flag;
	void check()
	{
		if(flag==true)
		{
			System.out.println("This Animal Is Eating !");
		}
		else if(flag==false)
		{
			System.out.println("This Animal Is Not Eating !");
		}
	}
	void Eating(int i)
	{
		if(i>0)
		{
			flag=true;
		}
		else
		{
			flag=false;
		}
		check();
	}
}

public class inheritance_concept6 {

	public static void main(String[] args) {
		
		lion l=new lion();
		tiger t=new tiger();
		elephant e=new elephant();
		l.Eating(10);
		t.Eating(0);
		e.Eating(20);
	}

}
