package com.awt;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/**
 *
 * @author HP
 */
public class AppWindow extends Frame {

    String keymsg = "This is a test.";
    String moumsg = " ";
    int mouseX = 0, mouseY = 30;

    public AppWindow() {
        addKeyListener(new MyKeyAdapter(this));
        addMouseListener(new MyMouseAdapter(this));
        addWindowListener(new MyWindowAdapter(this));
    }

    public void paint(Graphics g) {
        g.drawString(keymsg, 10, 40);
        g.drawString(moumsg, mouseX, mouseY);
    }

    public static void main(String[] args) {
        AppWindow appwin = new AppWindow();

        appwin.setSize(new Dimension(300, 200));
        appwin.setTitle("An AWT based application");
        appwin.setVisible(true);
    }
}

class MyKeyAdapter extends KeyAdapter {

    AppWindow appWindow;

    public MyKeyAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }

    public void keyTyped(KeyEvent ke) {
        appWindow.keymsg += ke.getKeyChar();
        appWindow.repaint();
    }
}

class MyMouseAdapter extends MouseAdapter{
    AppWindow appWindow;
    public MyMouseAdapter(AppWindow appWindow){
        this.appWindow = appWindow;
    }
    
    public void mousePressed(MouseEvent me){
        appWindow.mouseX = me.getX();
        appWindow.mouseY = me.getY();
        appWindow.moumsg = "Mouse Down at " + appWindow.mouseX + ", " + appWindow.mouseY;
        appWindow.repaint();
    }
}

class MyWindowAdapter extends WindowAdapter{

    AppWindow appWindow;
    MyWindowAdapter(AppWindow appWindow) {
        this.appWindow = appWindow;
    }
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}