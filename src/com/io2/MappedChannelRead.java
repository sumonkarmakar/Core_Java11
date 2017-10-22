// Use the new I/O System to read a text file.
package com.io2;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class MappedChannelRead
{
	public static void main(String args[])
	{
		FileInputStream fIn;
		FileChannel fChan;
		long fSize;
		MappedByteBuffer mBuf;
		
		try
		{
		// First, Open a file for input.
		fIn = new FileInputStream("test.txt");
		
		// Next, obtain a channel to that file.
		fChan = fIn.getChannel();
		
		// Now, get the file's size.
		fSize = fChan.size();
		
		// Now , map the file into a buffer.
		mBuf = fChan.map(FileChannel.MapMode.READ_ONLY,0,fSize);
		
		// Read bytes from the buffer.
		for(int i=0;i<fSize;i++)
			System.out.println((char)mBuf.get());
		fChan.close();		// close channel
		fIn.close();		// close file
	     }
		catch(IOException exc)
		{
			System.out.println(exc);
			System.exit(1);
		}
	}
}
		

