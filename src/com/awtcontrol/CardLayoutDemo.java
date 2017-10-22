package com.awtcontrol;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class CardLayoutDemo extends Applet implements ActionListener,MouseListener{

	Checkbox Win98,winNT,solaris,mac;
	Panel osCards;
	CardLayout cardLO;
	Button Win,Other;
	
	public void init(){
		Win = new Button("Windows");
		Other = new Button("Other");
		add(Win);
		add(Other);
		
		cardLO = new CardLayout();
		osCards = new Panel();
		osCards.setLayout(cardLO);
		
		Win98 = new Checkbox("Windows 98/XP", null, true);
		winNT = new Checkbox("Windows NT/2000");
		solaris = new Checkbox("Solaris");
		mac = new Checkbox("MacOS");
		
		Panel winPan = new Panel();
		winPan.add(Win98);
		winPan.add(winNT);
		
		Panel otherPan = new Panel();
		otherPan.add(solaris);
		otherPan.add(mac);
		
		osCards.add(winPan, "Windows");
		osCards.add(otherPan, "Other");
		
		add(osCards);
		
		Win.addActionListener(this);
		Other.addActionListener(this);
		
		addMouseListener(this);
	}
	
	@Override
	public void mousePressed(MouseEvent me) {
		// TODO Auto-generated method stub
		cardLO.next(osCards);
	}
	
	@Override
	public void mouseClicked(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent me) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()==Win){
			cardLO.show(osCards, "Windows");
		}else{
			cardLO.show(osCards, "Other");
		}
	}

}
