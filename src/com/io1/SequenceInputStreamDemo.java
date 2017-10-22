// Demonstrate sequenced input.
package com.io1;
import java.io.*;
import java.util.*;
class InputStreamEnumerator implements Enumeration
{
	private Enumeration files;
	public InputStreamEnumerator(Vector files)
	{
		this.files = files.elements();
	}
	public boolean hasMoreElements()
	{
		return files.hasMoreElements();
	}
	public Object nextElement()
	{
		try
		{
			return new FileInputStream(files.nextElement().toString());
		}
		catch(Exception e)
		{
			return null;
		}
	}
}
class SequenceInputStreamDemo
{
	public static void main(String args[]) throws IOException
	{
		int c;
		Vector files = new Vector();
		
		files.addElement("/autoexec.bat");
		files.addElement("/config.sys");
		InputStreamEnumerator e = new InputStreamEnumerator(files);
		InputStream input = new SequenceInputStream(e);
		while((c=input.read())!=-1)
		{
			System.out.print((char) c);
		}
		input.close();
	}
}

		
		