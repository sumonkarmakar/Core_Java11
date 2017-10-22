package com.applet;

import java.applet.*;
import java.net.*;
import java.util.*;


/**
 *
 * @author HP
 */
public class ACDemo extends Applet {

    public void start(){
        AppletContext ac = getAppletContext();
        URL url = getCodeBase();
        
        try{
            ac.showDocument(new URL(url+"Test.html"));
            
        } catch (MalformedURLException ex) {
            showStatus("URL not found");
        }
    }
}
