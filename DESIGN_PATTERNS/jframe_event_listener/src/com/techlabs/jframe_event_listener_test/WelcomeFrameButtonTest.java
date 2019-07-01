package com.techlabs.jframe_event_listener_test;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.techlabs.jframe_event_listener.WelcomeFrameButton;

public class WelcomeFrameButtonTest {
	
	public static void main(String args[])
	{
		WelcomeFrameButton wfb=new WelcomeFrameButton("Welcome");

		wfb.setResizable(false);
		wfb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		wfb.setVisible(true);
		
		
	}

}
