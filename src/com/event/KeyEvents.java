// Demonstrate KeyEvents
package com.event;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class KeyEvents extends Applet implements KeyListener{
    String msg = " ";
    int X = 0, Y = 10;
    
    public void init(){
        addKeyListener(this);
        requestFocus();
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
        showStatus("Key Down");
        
        int key = ke.getKeyCode();
        switch(key){
            case KeyEvent.VK_F1:
                msg+="<F1>";
                break;
            case KeyEvent.VK_F2:
                msg+="<F2>";
                break;
            case KeyEvent.VK_F3:
                msg+="<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                msg+="<PgDn>";
                break;
            case KeyEvent.VK_PAGE_UP:
                msg+="<PgUp>";
                break;
            case KeyEvent.VK_LEFT:
                msg+="<Left Arrow>";
                break;
            case KeyEvent.VK_RIGHT:
                msg+="<Right Arrow>";
                break;
        }
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
