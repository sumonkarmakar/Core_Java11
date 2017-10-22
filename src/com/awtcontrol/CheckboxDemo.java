// Demonstrate checkbox
package com.awtcontrol;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class CheckboxDemo extends Applet implements ItemListener {

    String msg = " ";
    Checkbox Win98, winNT, solaris, mac;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        Win98 = new Checkbox("Windows 98/Xp", null, true);
        winNT = new Checkbox("Windows NT/2000");
        solaris = new Checkbox("Solairs");
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

    @Override
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    public void paint(Graphics g) {
        msg = "Current State:";
        g.drawString(msg, 6, 80);
        msg = "Windows 98/XP: " + Win98.getState();
        g.drawString(msg, 6, 100);
        msg = "Windows NT/2000: " + winNT.getState();
        g.drawString(msg, 6, 120);
        msg = "Solaris: " + solaris.getState();
        g.drawString(msg, 6, 140);
        msg = "MacOs: " + mac.getState();
        g.drawString(msg, 6, 160);
    }
}
