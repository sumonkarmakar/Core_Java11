// Display a text file
package com.io;

import java.io.*;

class ShowFile {

    public static void main(String args[])
            throws IOException {
        int i;
        FileInputStream fin;
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("FIle Not Found");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: ShowFile File");
            return;
        }
        // read character until EOF is encountered
        do {
            i = fin.read();
            if (i != -1) {
                System.out.println((char) i);
            }
        } while (i != -1);
        fin.close();
    }
}
