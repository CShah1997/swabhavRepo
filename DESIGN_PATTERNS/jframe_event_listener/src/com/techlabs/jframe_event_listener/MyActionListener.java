package com.techlabs.jframe_event_listener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyActionListener implements ActionListener{
	
	WelcomeFrameButton f;
	
	public MyActionListener(WelcomeFrameButton f) {
		this.f=f;
		
	}
	

	public void actionPerformed(ActionEvent e) {
		String str=f.getTextInserted().toString();

		f.setText("Name submitted..."+str);
		
		f.getContentPane().setBackground(Color.YELLOW);
	}
	
	

}
