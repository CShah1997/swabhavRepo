package com.techlabs.jframe_welcome_frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;

public class WelcomeFrame extends JFrame{
	
	public WelcomeFrame() {
		// TODO Auto-generated constructor stub
	}
	
	public WelcomeFrame(String title)
	{
		super(title);
	}
	
	public WelcomeFrame(Color bgColor)
	{
		this.getContentPane().setBackground(bgColor);
		
	}
	
	public WelcomeFrame(int height,int width,boolean resizable)
	{
		this.getContentPane().setSize(width, height);
		this.setResizable(resizable);
	}

}
