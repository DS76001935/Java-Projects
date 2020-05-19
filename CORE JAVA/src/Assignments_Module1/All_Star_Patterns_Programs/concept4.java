package Assignments_Module1.All_Star_Patterns_Programs;

class star4
{
	int i,j;
	void process4()
	{
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5;j++)
			{
				if(j<=6-i)
				{
					if(i%2==0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
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

public class concept4 {
	
	public static void main(String[] args) {
		
		star4 s4=new star4();
		s4.process4();
		
	}

}
