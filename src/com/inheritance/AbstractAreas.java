package com.inheritance;
abstract class Figure3
{
	double dim1;
	double dim2;
	Figure3(double a,double b)
	{
		dim1 = a;
		dim2 = b;
	}
	// area is now in the abstract method
	abstract double area();
};
class Rectangle2 extends Figure3
{
	Rectangle2(double a,double b)
	{
		super(a,b);
	}
	// Override area for rectangle
	double area()
	{
		System.out.println("Inside area for rectangle.");
		return dim1 * dim2;
	}
}
class Triangle extends Figure
{
	Triangle(double a,double b)
	{
		super(a,b);
	}
	// override area for right triangle
	double area()
	{
		System.out.println("Inside area for triangle.");
		return dim1 * dim2 /2;
	}
}
class AbstractAreas
{
	public static void main(String args[])
	{
	// Figure f = new Figure(10,10);	// illegal now
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);
		
		Figure figref;				// this is O.K., no object is created
		
		figref = r;
		System.out.println("Area is " + figref.area());
		
		figref = t;
		System.out.println("Area is " + figref.area());
	}
}
		