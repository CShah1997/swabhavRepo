package com.techlabs.jframe_event_listener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class WelcomeFrameButton extends JFrame {
	
	JLabel label1,label;
	JButton b;
	JTextField textfield;

	public WelcomeFrameButton() {
		super();
	}

//	public WelcomeFrameButton(String title,int height,int width,Color color)
//	{
//		super(title);
//		this.getContentPane().setSize(width, height);
//		this.setSize(width, height);
//		this.getContentPane().setBackground(color);
//		JTextField textfield1 = new JTextField("Enter Name", 20);
//		this.getContentPane().add(textfield1);
//		JButton button=new JButton("Click Me...");
//		button.setBounds(50, 20, 15, 10);
//		this.add(button);
//		this.getContentPane().setLayout(new FlowLayout());
//	}

	public WelcomeFrameButton(String title) {
		this.setTitle(title);
		b = new JButton("Submit");
		b.setBounds(100, 100, 140, 40);
		label = new JLabel();
		label.setText("Enter Name :");
		label.setBounds(10, 10, 100, 100);
		label1 = new JLabel();
		label1.setBounds(10, 110, 200, 100);
		textfield = new JTextField();
		textfield.setBounds(110, 50, 130, 30);
		this.add(label1);
		this.add(textfield);
		this.add(label);
		this.add(b);
		this.setSize(300, 300);
		this.setLayout(null);
		b.addActionListener(new MyActionListener(this));
	}
	
	public void setText(String str)
	{
		label1.setText(str);
	}
	
	public String getTextInserted()
	{
		return textfield.getText();
	}
}
