// Using the ? quantifier.
package com.io2;
import java.util.regex.*;
class RegExpr6
{
	public static void main(String args[])
	{
		// Using reluctant matching behaviour.
		Pattern pat = Pattern.compile("e.+?d");
		Matcher mat = pat.matcher("extended cup end table");
		
		while(mat.find())
		{
			System.out.println("Match: " + mat.group());
		}
	}
}