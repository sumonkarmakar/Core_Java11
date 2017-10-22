
package com.applet;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class Sample extends Applet{
    String msg;
    
    public void init(){
        setForeground(Color.red);
        setBackground(Color.cyan);
        msg = "Inside init()--";
    }
    
    public void start(){
        msg+="Inside start()--";
    }
    
    public void paint(Graphics g){
        msg+="Inside paint()--";
        g.drawString(msg,10,30);
    }
}
