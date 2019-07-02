package com.techlabs.html_generator_test;

import com.techlabs.html_generator.Control;
import com.techlabs.html_generator.ControlGroups;

public class CompositeTest {
	
	public static void main(String args[])
	{
		Control control1=new Control("UserName", "input", "text");
		Control control2=new Control("Password", "input", "password");
		ControlGroups body=new ControlGroups("body");
		ControlGroups div=new ControlGroups("div");
		div.addTag(control1);
		div.addTag(control2);
		System.out.println(div.parseToHTML());
	}

}
