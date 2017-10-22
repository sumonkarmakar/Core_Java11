// Demonstrate File Reader.
package com.io1;

import java.io.*;

class FileReaderDemo {

    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("FileReaderDemo.java");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        fr.close();
    }
}
