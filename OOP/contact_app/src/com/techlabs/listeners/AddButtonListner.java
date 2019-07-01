package com.techlabs.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.techlabs.contact.ContactService;
import com.techlabs.frames.AddContactFrame;

public class AddButtonListner implements ActionListener {
	private AddContactFrame frame;
	private ContactService services;
	public AddButtonListner(AddContactFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String name = AddContactFrame.getNameField();
		String email = AddContactFrame.getEmailField();
		Long phone = Long.parseLong(AddContactFrame.getPhoneField());
		
		services = new ContactService();
		services.saveContact(name, email, phone);
		JOptionPane.showMessageDialog(frame,"Contact Added"); 
	}

}
