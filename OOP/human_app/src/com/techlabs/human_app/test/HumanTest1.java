package com.techlabs.human_app.test;

import com.techlabs.human_app.*;
public class HumanTest1 {
	
	public static void main(String args[]) {
		
		Human h1=new Human("Chirag", 20);
		Human h2=new Human("Dev",30);
		Human elder=h1.whoIsElder(h2);
		System.out.println(elder.getName());

		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(elder.hashCode());
	}

}
