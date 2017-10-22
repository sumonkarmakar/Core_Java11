// Demonstrate StringTokenizer
package com.util2;

import java.util.*;

/**
 *
 * @author HP
 */
public class STDemo {

    static String in = "title=Java: The complete Reference"
            + "author=Schieldt;"
            + "publisher=Osborne/McGraw-Hill;"
            + "copyright=2002";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
