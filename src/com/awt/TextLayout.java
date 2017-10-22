package com.awt;

import java.applet.*;
import java.awt.*;
import java.util.*;

public class TextLayout extends Applet{
	final int LEFT=0;
	final int RIGHT=1;
	final int CENTER=2;
	final int LEFTRIGHT=3;
	int align;
	Dimension d;
	Font f;
	FontMetrics fm;
	int fontSize;
	int fh,bl;
	int space;
	String text;
	
	public void init(){
		setBackground(Color.white);
		text = getParameter("text");
		try{
			fontSize = Integer.parseInt(getParameter("fontSize"));
		}catch(NumberFormatException e){
			fontSize = 14;
		}
		align = LEFT;
		addMouseListener(new MyMouseAdapter(this));
	}
	
	public void paint(Graphics g){
		update(g);
	}
	
	public void update(Graphics g){
		d = getSize();
		g.setColor(getBackground());
		g.fillRect(0, 0, d.width, d.height);
		g.setFont(f);
		if(fm==null){
			fm = g.getFontMetrics();
			bl=fm.getAscent();
			fh=bl+fm.getDescent();
			space = fm.stringWidth(" ");
		}
		
		g.setColor(Color.black);
		StringTokenizer st = new StringTokenizer(text);
		int x=0;
		int nextx;
		int y=0;
		String word,sp;
		int wordCount=0;
		String line=" ";
		while(st.hasMoreTokens()){
			word = st.nextToken();
			if(word.equals("<P>")){
				drawString(g,line,wordCount,fm.stringWidth(line),y+bl);
				line = " ";
				wordCount =0;
				x=0;
				y=y+(fh*2);
			}else{
				int w = fm.stringWidth(word);
				if((nextx=(x+space+w))>d.width){
					drawString(g,line,wordCount,fm.stringWidth(line),y+bl);
					line = " ";
					wordCount = 0;
					x=0;
					y=y+fh;
				}
				if(x!=0)
				{
					sp=" ";
				}else
				{
					sp=" ";
				}
				line = line+sp+word;
				x=x+space+w;
				wordCount++;
			}
		}
		drawString(g, line, wordCount, fm.stringWidth(line), y+bl);
	}

	private void drawString(Graphics g, String line, int wordCount, int stringWidth, int i) {
		// TODO Auto-generated method stub
		
	}
}
