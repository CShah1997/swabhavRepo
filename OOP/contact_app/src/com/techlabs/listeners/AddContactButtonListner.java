package com.techlabs.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.techlabs.frames.AddContactFrame;

public class AddContactButtonListner implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		new AddContactFrame();
	}

}
