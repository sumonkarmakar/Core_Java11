// Demonstrate List
package com.awtcontrol;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class ListDemo extends Applet implements ActionListener
{
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    List os,browser;
    String msg = " ";
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        os = new List(4, true);
        browser = new List(4, false);
        
        // add items to the os list
        os.add("Windows 98/XP");
        os.add("Windows NT/2000");
        os.add("Solaris");
        os.add("MacOS");
        
        // add item to the browser list
        browser.add("Netscape 3.x");
        browser.add("Netscape 4.x");
        browser.add("Netscape 5.x");
        browser.add("Netscape 6.x");
        
        browser.add("Internet Explorer 4.0");
        browser.add("Internet Explorer 5.0");
        browser.add("Internet Explorer 6.0");
        
        browser.add("Lynx 2.4");
        
        browser.select(1);
        
        // add list to window
        add(os);
        add(browser);
        
        
        // register to receive action event
        os.addActionListener(this);
        
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }
    
    public void paint(Graphics g){
        int idx[];
        msg = "Current OS: ";
        idx = os.getSelectedIndexes();
        for(int i=0;i<idx.length;i++)
            msg+=os.getItem(idx[i]) + " ";
        g.drawString(msg, 6, 120);
        msg = "Current Browser: ";
        msg+=browser.getSelectedItem();
        g.drawString(msg, 6, 140);
    }
}
