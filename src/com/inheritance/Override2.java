package com.inheritance;
class A7
{
	int i,j;
	A7(int a,int b)
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
class B7 extends A7
{
	int k;
	B7(int a,int b,int c)
	{
		super(a,b);
		k = c;
	}
	// Overload Show()
	void show(String msg)
	{
		System.out.println(msg + k);
	}
}
class Override2
{
	public static void main(String args[])
	{
		B7 subOb = new B7(1,2,3);
		subOb.show("This is k: ");		// this calls show() in B
		subOb.show();				// this calls show() in A 
	}
}