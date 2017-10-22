// Convert an Array List into an array
package com.util1;
import java.util.*;
class ArrayListToArray
{
	public static void main(String args[])
	{
		// create array list
		ArrayList a1 = new ArrayList();
		// Add elements to the array list
		a1.add(new Integer(1));
		a1.add(new Integer(2));
		a1.add(new Integer(3));
		a1.add(new Integer(4));
		
		System.out.println("Contents of a1: " + a1);
		
		// get array
		Object ia[] = a1.toArray();
		int sum = 0;
		
		// sum the array
		
		for(int i=0;i<ia.length;i++)
			sum += ((Integer) ia[i]).intValue();
		
		System.out.println("Sum is: " + sum);
	}
}

		