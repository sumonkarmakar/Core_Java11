// Use the new IO System to read a text file
package com.io2;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

/**
 * @author HP
 *
 */
public class ExplicitChannelRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fIn;
		FileChannel fChan;
		long fSize;
		ByteBuffer mBuf;
		
		try{
			fIn = new FileInputStream("test.txt");
			fChan = fIn.getChannel();
			fSize = fChan.size();
			mBuf = ByteBuffer.allocate((int)fSize);
			fChan.read(mBuf);
			mBuf.rewind();
			for(int i=0;i<fSize;i++)
				System.out.println((char)mBuf.get());
			System.out.println();
			fChan.close();
			fIn.close();
		}catch(IOException exc){
			System.out.println(exc);
			System.exit(1);
		}
	}

}
