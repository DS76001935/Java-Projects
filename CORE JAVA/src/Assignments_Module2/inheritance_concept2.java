package Assignments_Module2;

class grandfather
{
	void logical()
	{
		System.out.println("Hey,I am a Totally Logical Person !");
	}
}
class father extends grandfather
{
	void hardwork()
	{
		System.out.println("Hey,I am a hard worker Person !");
	}
}
class child extends father
{
	void artist()
	{
		System.out.println("Hey,I am an also aritist !");
	}
}

public class inheritance_concept2 {

	public static void main(String[] args) {
		
		child c=new child();
		c.logical();
		c.hardwork();
		c.artist();

	}

}
