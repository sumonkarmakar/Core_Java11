package com.exception;
class SuperSubCatch
{
	public static void main(String args[])
	{
		try
		{
			int a = 0;
			int b = 42 / a;
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception catch.");
		}
		catch(ArithmeticException e)
		{
			// Error - not reachable
			System.out.println("This is never Reached.");
		}
	}
}