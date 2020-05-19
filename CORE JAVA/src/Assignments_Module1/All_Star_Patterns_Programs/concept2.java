package Assignments_Module1.All_Star_Patterns_Programs;

class star2
{
	int i=5,j=5;
	void process2()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(j>=6-i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

public class concept2 {

	public static void main(String[] args) {
		
		star2 s2=new star2();
		s2.process2();
		
	}
}
