package com.techlabs.html_generator;

public class Control implements IHtmlElement {
	
	private String text;
	private String name;
	private String type;
	

	public Control(String text, String name, String type) {
		this.text = text;
		this.name = name;
		this.type = type;
	}

	
	@Override
	public String parseToHTML() {
		return text+":<input type="+type+"/>";
	}
	

}
