// Write to a file using the new I/O.
package com.io2;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
public class ExplicitChannelWrite
{
	public static void main(String args[])
	{
		FileOutputStream fout;
		FileChannel fChan;
		long fSize;
		ByteBuffer mBuf;
		
		try
		{
		fout = new FileOutputStream("test.txt");
		
		// Get a channel to the output file.
		fChan = fout.getChannel();
		
		// Create a buffer.
		
		mBuf = ByteBuffer.allocateDirect(26);
		
		// write some bytes to the buffer.
		for(int i=0;i<26;i++)
			mBuf.put((byte)('A'+i));
			
		// Rewind the bufferso that it can written.
		mBuf.rewind();
		
		// Write the buffer to the output file.
		fChan.write(mBuf);
		
		// close the channel and file
		fChan.close();
		fout.close();
		}
		catch(IOException exc)
		{
			System.out.println(exc);
			System.exit(1);
		}
	}
}		

