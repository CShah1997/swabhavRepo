package com.techlabs.contactConsoul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import com.techlabs.contact.ContactService;

public class ConatctConsole {
	
	ContactService service;

	public ConatctConsole() {
		service = new ContactService();
	}

	public void start() throws NumberFormatException, IOException {
		while (true) {
			System.out.println("1. Save Contact");
			System.out.println("2. Display Conatct");
			System.out.println("3. Exit");
			System.out.println("Enetr your choice : ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int choice=Integer.parseInt(br.readLine());
			if (choice >= 3) {
				break;
			}
			if (choice == 1) {

				System.out.println("Enter Name : ");
				String name = br.readLine();
				System.out.println("Enter email : ");
				String email = br.readLine();
				System.out.println("Enter Phone Number : ");
				Long phone =Long.parseLong(br.readLine());
				service.saveContact(name, email, phone);
			}
			if (choice == 2) {
				service.displayContact();
			}
			br.close();
		}
	}
	
	public static void main(String args[]) throws IOException {
		new ConatctConsole().start();
	}
}
