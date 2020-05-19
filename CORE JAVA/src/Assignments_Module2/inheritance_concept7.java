package Assignments_Module2;

class Tri
{
	double height;
	double width;
	Tri()
	{
		height=300;
		width=400;
	}
	Tri(double height,double width)
	{
		this.height=height;
		this.width=width;
	}
	void area1()
	{
		System.out.println("Area Of Triangle Is => " + (height*width/0.5));
	}
}
class ract extends Tri
{
	ract()
	{
		super();
	}
	ract(double height,double width)
	{
		super(height,width);
	}
	void area2()
	{
		System.out.println("Area Of Rectangle Is => " + (super.height*super.width));
	}
}
class cir extends ract
{
	double radius;
	float pi=3.14f;
	cir()
	{
		//By default immidiate super class constructor of this class is called here...
		radius=10;
	}
	cir(double height,double width,double radius)
	{
		super(height,width);
		this.radius=radius;
	}
	void area3()
	{
		System.out.println("Area Of Circle Is => " + (pi*(radius*radius)));
	}
}

public class inheritance_concept7 {

	public static void main(String[] args) {
		
		cir c1=new cir(30,40,90);
		c1.area1();
		c1.area2();
		c1.area3();

	}

}
