// A simple demonstration of abstract
package com.inheritance;
abstract class A3
{
	abstract void callme();
	// concrete method are still allowed in the abstract class
	void callmetoo()
	{
		System.out.println("This is a concrete method.");
	}
}
class B3 extends A3
{
	void callme()
	{
		System.out.println("B's implementation of callme.");
	}
}
class AbstractDemo
{
	public static void main(String args[])
	{
		B3 b = new B3();
		b.callme();
		b.callmetoo();
	}
}
	