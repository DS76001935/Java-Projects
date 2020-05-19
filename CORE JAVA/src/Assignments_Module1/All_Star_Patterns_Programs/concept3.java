package Assignments_Module1.All_Star_Patterns_Programs;

class star3
{
	int i,j;
	void process3()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(j<=i)
				{
					System.out.print(i);
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

public class concept3 {

	public static void main(String[] args) {
		star3 s3=new star3();
		s3.process3();
	}

}
