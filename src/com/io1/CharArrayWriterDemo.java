// Demonstrate CharArrayWriter.
package com.io1;

import java.io.*;

class CharArrayWriterDemo {

    public static void main(String args[]) throws IOException {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This should end up in the array";
        char buf[] = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        f.write(buf);
        System.out.println("Buffer as a string.");
        System.out.println(f.toString());
        System.out.println("Into Array");
        char c[] = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println("\nTo a FileWriter()");
        FileWriter f2 = new FileWriter("test.txt");
        f.writeTo(f2);
        f2.close();
        f.reset();
        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
    }
}
