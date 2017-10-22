// show fonts
package com.awt;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author HP
 */
public class SampleFonts extends Applet {
    int next=0;
    Font f;
    String msg;
    public void init() {
        // TODO start asynchronous download of heavy resources
        f = new Font("Dialog", Font.PLAIN, 12);
        msg = "Dialog";
        setFont(f);
        addMouseListener(new MyMouseAdapter(this));
    }
    
    public void paint(Graphics g){
        g.drawString(msg, 4, 20);
    }
}

class MyMouseAdapter extends MouseAdapter{
    SampleFonts sampleFonts;
    public MyMouseAdapter(SampleFonts sampleFonts){
        this.sampleFonts = sampleFonts;
    }
    
    public void mousePressed(MouseEvent me){
        sampleFonts.next++;
        switch(sampleFonts.next){
            case 0: 
                sampleFonts.f = new Font("Dialog", Font.PLAIN, 12);
                sampleFonts.msg = "Dialog";
                break;
            case 1: 
                sampleFonts.f = new Font("DialogInput", Font.PLAIN, 12);
                sampleFonts.msg = "DialogInput";
                break;
            case 2: 
                sampleFonts.f = new Font("SansSerif", Font.PLAIN, 12);
                sampleFonts.msg = "SansSerif";
                break;
            case 3: 
                sampleFonts.f = new Font("Serif", Font.PLAIN, 12);
                sampleFonts.msg = "Serif";
                break;
            case 4: 
                sampleFonts.f = new Font("Monospaced", Font.PLAIN, 12);
                sampleFonts.msg = "Monospaced";
                break;    
        }
        if(sampleFonts.next==4)
            sampleFonts.next=-1;
        sampleFonts.setFont(sampleFonts.f);
        sampleFonts.repaint();
    }
}
