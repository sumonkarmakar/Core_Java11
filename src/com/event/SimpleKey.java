
package com.event;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class SimpleKey extends Applet implements KeyListener{

    String msg = " ";
    int X=10,Y=20;
    
    public void init(){
        addKeyListener(this);
        requestFocus();
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        showStatus("Key Up");
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        msg+=ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg, X, Y);
    }
    
}
