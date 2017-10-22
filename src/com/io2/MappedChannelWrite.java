// Write to a mapped file.
package com.io2;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class MappedChannelWrite {

    public static void main(String args[]) {
        RandomAccessFile fOut;
        FileChannel fChan;
        ByteBuffer mBuf;

        try {
            // First, Open a file for input.
            fOut = new RandomAccessFile("test.txt", "rw");

            // Next, obtain a channel to that file.
            fChan = fOut.getChannel();

            // Now , map the file into a buffer.
            mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            // Write some bytes to the buffer.
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }

            // close channels and files.
            fChan.close();
            fOut.close();
        } catch (IOException exc) {
            System.out.println(exc);
            System.exit(1);
        }
    }
}
