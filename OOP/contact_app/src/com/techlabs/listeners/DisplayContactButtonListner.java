package com.techlabs.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import com.techlabs.contact.Contact;
import com.techlabs.contact.ContactService;
import com.techlabs.frames.DisplayFrame;

public class DisplayContactButtonListner implements ActionListener{
	private ArrayList<Contact> contactList;
	private ContactService service;
	
	public DisplayContactButtonListner() {
		service = new ContactService();
	}
	
	public void actionPerformed(ActionEvent e) {
		contactList = service.retriveContactsFromDisk();
		new DisplayFrame(contactList);
	}
}
