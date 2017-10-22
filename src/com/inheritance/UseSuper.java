// Using super to overcome name hiding.
package com.inheritance;
class A2
{
	int i;
}
// creating a subclass by extending class A
class B2 extends A2
{
	int i;		// this i hides i in a
	B2(int a,int b)
	{
		super.i = a;	// i in a
		i = b;			// i in b
	}
	void show()
	{
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: "   + i);
	}
}
class UseSuper
{
	public static void main(String args[])
	{
		B2 subOb = new B2(1,2);
		subOb.show();
	}
}
		