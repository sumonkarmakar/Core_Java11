// A simple moving banner
package com.applet;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class SimpleBanner extends Applet {
    String msg = "A simple moving banner";
    Thread t = null;
    int state;
    boolean stopFlag;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void start(){
        t = new Thread();
        stopFlag = false;
        t.start();
    }
    
    public void run(){
        char ch;
        for(;;){
            try{
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg+=ch;
                if(stopFlag)
                    break;
            }catch(InterruptedException e){
                
            }
        }
    }
    
    public void stop(){
        stopFlag = true;
        t = null;
    }
    
    public void paint(Graphics g){
        g.drawString(msg, 50, 30);
    }
}
