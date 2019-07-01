package com.techlabs.jframe_welcome_frame_test;

import java.awt.Color;

import com.techlabs.jframe_welcome_frame.WelcomeFrame;

public class WelcomeFrameTest {

	public static void main(String args[])
	{
		WelcomeFrame wf=new WelcomeFrame(Color.BLUE);
		wf.setTitle("Welcome");
		wf.setSize(500, 500);
		wf.setResizable(false);
		wf.setVisible(true);
		
	
	}
	
}
