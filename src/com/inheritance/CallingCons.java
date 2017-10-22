// Demonstrate when Constructor called
package com.inheritance;
// create a super class.
class A5
{
	A5()
	{
		System.out.println("Inside A's constructor.");
	}
}
// create a sub class by extending class A.
class B5 extends A5
{
	B5()
	{
		System.out.println("Inside B's constructor.");
	}
}
// create a sub class by extending class B.
class C5 extends B5
{
	C5()
	{
		System.out.println("Inside C's constructor.");
	}
}
class CallingCons
{
	public static void main(String args[])
	{
		C5 c = new C5();
	}
}


