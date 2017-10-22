package com.applet;

import java.applet.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class ParamBanner extends Applet implements Runnable {

    String msg;
    Thread t = null;
    int state;
    boolean stopFlag;

    @Override
    public void init() {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    @Override
    public void start() {
        msg = getParameter("message");
        if (msg == null) {
            msg = "Message not found";
        }
        msg = " " + msg;
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    @Override
    public void run() {
        char ch;

        for (;;) {
            try {
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg+=ch;
                if(stopFlag)
                    break;
            } catch (InterruptedException e) {
                
            }
        }
    }
    
    @Override
    public void stop(){
        stopFlag = true;
        t = null;
    }
    
    public void paint(Graphics g){
        g.drawString(msg, 50, 30);
    }

}
