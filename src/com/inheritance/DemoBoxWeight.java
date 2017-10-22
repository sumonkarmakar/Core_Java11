// This program uses inheritance to extend Box.
package com.inheritance;
class Box
{
	double width;
	double height;
	double depth;
	
	// Construct clone of an object
	Box(Box ob)
	{
		// pass object to Constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	// Constructor used when all dimension specified
	Box(double w,double h,double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	// Constructor used when no dimension specified
	Box()
	{
		width = -1;		// used -1 to indicate
		height = -1;	// an un initialized
		depth = -1;		// box
	}
	// Constructor when cube is created
	Box(double len)
	{
		width = height = depth = len;
	}
	// Compute and return volume
	double volume()
	{
		return width * height * depth;
	}
}
// Here, Box is extended to include weight
class BoxWeight extends Box
{
	double weight;	// weight of box
	// constructor for BoxWeight
	BoxWeight(double w,double h,double d,double m)
	{
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}
class DemoBoxWeight
{
	public static void main(String args[])
	{
		BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
		BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
		double vol;
		
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();
		
		vol = mybox2.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox2.weight);
	}
}
		
		
	
	