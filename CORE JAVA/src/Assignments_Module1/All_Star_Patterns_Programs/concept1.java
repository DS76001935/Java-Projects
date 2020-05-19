package Assignments_Module1.All_Star_Patterns_Programs;

class star1
{
	int i,j;
	void process1()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(j<=i)
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

public class concept1 {

	public static void main(String[] args) {
		
		star1 s1=new star1();
		s1.process1();

	}

}
