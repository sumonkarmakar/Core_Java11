
package com.applet;

import java.applet.*;
import java.awt.*;
import java.net.*;

/**
 *
 * @author HP
 */
public class Bases extends AppletSkel{
    public void paint(Graphics g){
        String msg;
        
        URL url = getCodeBase();
        msg = "Code base: " + url.toString();
        g.drawString(msg, 10, 20);
        
        url = getDocumentBase();
        msg = "Document Base: " + url.toString();
        g.drawString(msg, 10, 40);
        
        
    }
}
