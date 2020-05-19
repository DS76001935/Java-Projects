package Assignments_Module2;

class rectangle
{
	int length,width,area;
	rectangle()
	{}
	rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;	
	}
	void area()
	{
		area=(length*width);
		System.out.println("Area of Rectagle :" + area);
	}
}

public class inheritance_concept1 {

	public static void main(String[] args) {
		
		rectangle r1=new rectangle(20,30);
		r1.area();
		
	}
	
}
