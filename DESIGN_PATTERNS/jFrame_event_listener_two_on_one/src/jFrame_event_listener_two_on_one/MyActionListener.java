package jFrame_event_listener_two_on_one;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {
	
	WelcomeFrame frame;
	
	public MyActionListener(WelcomeFrame frame) {
		this.frame=frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource()==frame.color1)
		{
			frame.getContentPane().setBackground(Color.RED);
		}
		
		if(event.getSource()==frame.color2)
		{
			frame.getContentPane().setBackground(Color.BLUE);
		}
		
		
	}

}
