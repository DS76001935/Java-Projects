package Assignments_Module2;

abstract class shape
{
	double area;
	double pi=3.14;
	abstract void showArea(double length,double breadth,double width,double radius);
}

class Triangle extends shape
{
	
	void showArea(double length,double breadth,double width,double radius)
	{
		area=(length*breadth*width/0.5);
		System.out.println("Area of Triangle => " + area);
	}
	
}

class Ractangle extends shape
{
	void showArea(double length,double breadth,double width,double radius)
	{
		area=(length*breadth*width);
		System.out.println("Area Of Rectangle => " + area);
	}
}

class Circle extends shape
{
	void showArea(double length, double breadth, double width, double radius) {
		
		area=(pi * (radius*radius));
		System.out.println("Area Of Circle => " + area);
		
	}
}

public class inheritance_concept4 {

	public static void main(String[] args) {
		
		Triangle T1=new Triangle();
		Ractangle R1=new Ractangle();
		Circle C1=new Circle();
		
		T1.showArea(20, 30, 50, 0);
		R1.showArea(20, 30, 50, 0);
		C1.showArea(0, 0, 0, 45);

	}

}
