// Use Left-aligned flow layout.
package com.awtcontrol;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class FlowLayoutDemo extends Applet implements ItemListener{

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    String msg = " ";
    Checkbox Win98,winNT,solaris,mac;
    
    public void init() {
        // TODO start asynchronous download of heavy resources
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        Win98 = new Checkbox("Windows 98/XP", null, true);
        winNT = new Checkbox("Windows NT/2000");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOs");
        
        add(Win98);
        add(winNT);
        add(solaris);
        add(mac);
        
        
        Win98.addItemListener(this);
        winNT.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);
    }

    // TODO overwrite start(), stop() and destroy() methods

    @Override
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
    
    public void paint(Graphics g){
        msg = "Current State: ";
        g.drawString(msg, 6, 80);
        msg+="Windows 98/XP: " + Win98.getState();
        g.drawString(msg, 6, 100);
        msg+="Windows NT/2000: " + winNT.getState();
        g.drawString(msg, 6, 120);
        msg+="Solaris: " + solaris.getState();
        g.drawString(msg, 6, 140);
        msg+="Mac: " + mac.getState();
        g.drawString(msg, 6, 160);
    }
}
