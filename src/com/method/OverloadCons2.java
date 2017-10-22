// Here Box allows one object to initialize another.
package com.method;
class Box2
{
	double width;
	double height;
	double depth;
	// Construct clone of an object
	Box2(Box2 ob)
	{
		// pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	// Constructor used when all dimentions are specified
	Box2(double w,double h,double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	// Constructor used when no dimentions are specified
	Box2()
	{
		width = -1;		// used -1 to indicate
		height = -1;	// an uninitialized 
		depth = -1;		// box
	}
	// Constructor used when cube is created
	Box2(double len)
	{
		width = height = depth = len;
	}
	// Compute and return volume
	double volume()
	{
		return width * height * depth;
	}
}
class OverloadCons2
{
	public static void main(String args[]) 
	{
		// Create box using the various constructor
		Box2 mybox1 = new Box2(10,20,15);
		Box2 mybox2 = new Box2();
		Box2 mycube = new Box2(7);

		Box2 myclone = new Box2(mybox1);

		double vol;

		// get the volume of the first box
		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);

		// get the volume of the second box
		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		
		// get the volume of the cube
		vol = mycube.volume();
		System.out.println("Volume of cube is " + vol);

		// get the volume of the clone
		vol = myclone.volume();
		System.out.println("Volume of clone is " + vol);
	}
}

