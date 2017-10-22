// Method Overriding
package com.inheritance;
class A6
{
	int i,j;
	A6(int a,int b)
	{
		i = a;
		j = b;
	}
	// display i and j
	void show()
	{
		System.out.println("i and j: " + i + " " + j);
	}
}
class B6 extends A6
{
	int k;
	B6(int a,int b,int c)
	{
		super(a,b);
		k = c;
	}
	// display k - this override show() in A
	void show()
	{
		System.out.println("k: " + k);
	}
}
class Override
{
	public static void main(String args[])
	{
		B6 subOb = new B6(1,2,3);
		subOb.show();				// this calls show() in B 
	}
}