// Demonstrate Multiline Output
package com.awt;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class MultiLine extends Applet {

    int curX=0,curY=0;
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g){
        FontMetrics fm = g.getFontMetrics();
        nextLine("This is on line one.",g);
        nextLine("This is on line two.",g);
        sameLine("This is on same line.",g);
        sameLine("This, too.",g);
        nextLine("This is on line three.",g);
    }
    
    void nextLine(String s,Graphics g){
        FontMetrics fm = g.getFontMetrics();
        curY = fm.getHeight();
        curX = 0;
        g.drawString(s, curX, curY);
        curX = fm.stringWidth(s);
    }
    
    void sameLine(String s,Graphics g){
        FontMetrics fm = g.getFontMetrics();
        g.drawString(s, curX, curY);
        curX+=fm.stringWidth(s);
    }
}
