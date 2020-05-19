package Assignments_Module2;

interface father1
{
	void fast_eating();
	void hardwork();
	void responsible();
	
}
interface mother1
{
	void soft_hearted();
	void good_cook();
}
class child1 implements father1 , mother1
{
	void logical()
	{
		System.out.println("Hey I am a Logical Person !");
	}
	@Override
	public void soft_hearted() {
		// TODO Auto-generated method stub
		System.out.println("My Mother Is  Very Soft Hearted Person !");
	}
	@Override
	public void good_cook() {
		// TODO Auto-generated method stub
		System.out.println("My Mother Is Cooking a Amazing Food!");
	}
	@Override
	public void hardwork() {
		// TODO Auto-generated method stub
		System.out.println("My father Is Very Hard Worker Person  !");
	}
	@Override
	public void responsible() {
		// TODO Auto-generated method stub
		System.out.println("My father Has Lots Of Reponsiblity Of Our Home !");
	}
	@Override
	public void fast_eating() {
		// TODO Auto-generated method stub
		System.out.println("My Father Is Eating Very Fast !");
	}
	
}

public class inheritance_interface_demo1 {

	public static void main(String[] args) {
		
		child1 c1=new child1();
		c1.logical();
		c1.fast_eating();
		c1.hardwork();
		c1.responsible();
		c1.soft_hearted();
		c1.good_cook();

	}

}
